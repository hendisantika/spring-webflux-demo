package com.hendisantika.springwebfluxdemo;

import com.hendisantika.springwebfluxdemo.model.Resource;
import com.hendisantika.springwebfluxdemo.repository.ResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class SpringWebfluxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebfluxDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ResourceRepository resourceRepository) {
        return (args) -> {
            for (int i = 0; i <= 100; i++) {
                resourceRepository.save(new Resource(UUID.randomUUID().toString(), "name" + i, "type" + i));
            }
        };
    }
}
