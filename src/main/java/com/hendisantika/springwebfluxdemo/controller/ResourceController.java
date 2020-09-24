package com.hendisantika.springwebfluxdemo.controller;

import com.hendisantika.springwebfluxdemo.model.Resource;
import com.hendisantika.springwebfluxdemo.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/09/20
 * Time: 06.15
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    ResourceRepository resourceRepository;

    @GetMapping("/{id}")
    public Mono<Resource> getResource(@PathVariable String id) {
        return resourceRepository.findById(id);
    }

    @GetMapping()
    public Flux<Resource> getResources() {
        return resourceRepository.findAll();
    }
}
