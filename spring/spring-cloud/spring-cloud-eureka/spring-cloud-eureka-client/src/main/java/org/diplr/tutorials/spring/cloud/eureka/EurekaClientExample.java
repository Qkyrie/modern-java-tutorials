package org.diplr.tutorials.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientExample {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientExample.class, args);
    }
}
