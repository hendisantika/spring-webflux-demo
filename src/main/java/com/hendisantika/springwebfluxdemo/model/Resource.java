package com.hendisantika.springwebfluxdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/09/20
 * Time: 06.12
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    @Id
    private String id;
    private String name;
    private String type;
}
