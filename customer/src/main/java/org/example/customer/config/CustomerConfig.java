package org.example.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {
    @Bean
    @LoadBalanced //Se agrega para indicar a Eureka server que decida cual instancia va a escoger
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
