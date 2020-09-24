package com.hendisantika.springwebfluxdemo.client;

import com.hendisantika.springwebfluxdemo.model.Resource;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/09/20
 * Time: 06.14
 */
public class WebFluxClient {
    private WebClient client;

    /**
     * Open connection to server
     *
     * @param url
     * @return
     */
    public WebClient openConnection(String url) {
        client = WebClient.create(url);
        return client;
    }

    /**
     * Request single resource
     *
     * @param id
     */
    public void getResourceById(String id) {
        Mono<Resource> result = client.get()
                .uri("/resource/{id}", "1")
                .retrieve()
                .bodyToMono(Resource.class);

        result.subscribe(System.out::println);
    }

    /**
     * Request a collection
     */
    public void getAllResources() {
        Flux<Resource> result = client.get()
                .uri("/resource")
                .retrieve()
                .bodyToFlux(Resource.class);

        result.subscribe(System.out::println);
    }
}
