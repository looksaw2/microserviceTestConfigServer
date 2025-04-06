package org.example.demomicroserviceconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemomicroserviceconfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomicroserviceconfigServiceApplication.class, args);
    }

}
