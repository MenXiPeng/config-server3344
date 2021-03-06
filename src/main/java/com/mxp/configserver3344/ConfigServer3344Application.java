package com.mxp.configserver3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer3344Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344Application.class, args);
    }

}
