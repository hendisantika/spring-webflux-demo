package com.hendisantika.springwebfluxdemo.repository;

import com.hendisantika.springwebfluxdemo.model.Resource;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/09/20
 * Time: 06.13
 */
public interface ResourceRepository extends ReactiveCrudRepository<Resource, String> {
}
