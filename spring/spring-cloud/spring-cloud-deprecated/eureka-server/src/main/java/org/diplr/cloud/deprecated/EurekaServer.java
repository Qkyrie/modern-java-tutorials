package org.diplr.cloud.deprecated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication eurekaServer = new SpringApplication(EurekaServer.class);
        eurekaServer.run(args);
    }
}
