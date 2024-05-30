package com.nishant.product_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class ApplicationConfiguration {

    @Bean
    public RestTemplate createRestTemplate(){
       return new RestTemplate();
    }

}
