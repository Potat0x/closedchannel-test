package pl.potat0x.closedchannelreprod.closedchannelreprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClosedchannelreprodApplication {

	public static void main(String[] args) {
		io.netty.util.Version.identify().entrySet().forEach(System.out::println);
		SpringApplication.run(ClosedchannelreprodApplication.class, args);
	}
}
