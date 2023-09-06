package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
