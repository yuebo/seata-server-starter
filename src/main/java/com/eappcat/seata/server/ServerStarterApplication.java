package com.eappcat.seata.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SeataServerConfigProperties.class)
public class ServerStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerStarterApplication.class, args);
    }

}
