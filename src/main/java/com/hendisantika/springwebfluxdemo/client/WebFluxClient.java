package com.hendisantika.springwebfluxdemo.client;

import org.springframework.web.reactive.function.client.WebClient;

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
}
