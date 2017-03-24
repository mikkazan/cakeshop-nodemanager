package com.jpmorgan.cakeshop.node.manager;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Profile("spring-boot")
public class CakeshopNodeManager {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CakeshopNodeManager.class).web(true).run(args);
    }
}
