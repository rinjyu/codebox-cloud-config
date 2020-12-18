package com.app.codebox.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CodeBoxCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeBoxCloudConfigApplication.class, args);
    }

}
