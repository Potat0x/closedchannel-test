package pl.potat0x.closedchannelreprod.closedchannelreprod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
class Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
    private final String bigResponse =
            "!@#$%^&*()_+=-0987654321qwertyuiop[]\\|}{POIUYTREWQasdfghjkl;':LKJHGFDSAzxcvbnm,./?><MNBVCXZ"
                    .repeat(6_000);

    final Mono<String> just = Mono.just(bigResponse);

    @GetMapping(path = "/test")
    Mono<String> test(@RequestParam("iter") String iter) {
//        System.out.println("received request: " + iter);
//        LOGGER.info("info");
        return just;
    }
}