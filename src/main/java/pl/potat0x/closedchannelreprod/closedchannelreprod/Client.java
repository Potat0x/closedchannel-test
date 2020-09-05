package pl.potat0x.closedchannelreprod.closedchannelreprod;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

final class Client {
    public static void main(String[] args) {
        final RestTemplate restTemplate = new RestTemplateBuilder()
                .setReadTimeout(Duration.ofMillis(123))
                .build();
        final int requestsToSend = 50;
        for (int i = 1; i <= requestsToSend; i++) {
            System.out.println("request " + i + "/" + requestsToSend);
            try {
                ResponseEntity<String> response = restTemplate.getForEntity("http://127.0.0.1:8080/test?iter=" + i, String.class);
                System.out.println(response.getStatusCode());
                System.out.println(response.getBody().length());
            } catch (Exception e) {
                System.out.println("client error: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}
