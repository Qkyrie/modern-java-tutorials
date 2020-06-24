package org.diplr.tutorials.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerExample {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerExample.class, args);
    }
}
