package pl.potat0x.closedchannelreprod.closedchannelreprod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class Controller {
    private final String bigResponse = "1234567890".repeat(34000);

    @GetMapping(path = "/test")
    Mono<String> test(@RequestParam("iter") String iter) {
        System.out.println("received request: " + iter);
        return Mono.just(bigResponse);
    }
}