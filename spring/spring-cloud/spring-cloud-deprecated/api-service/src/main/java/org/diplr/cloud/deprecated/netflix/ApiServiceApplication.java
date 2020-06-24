package org.diplr.cloud.deprecated.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
public class ApiServiceApplication {

    public static void main(String[] args) {
        new SpringApplication(ApiServiceApplication.class).run(args);
    }
}
