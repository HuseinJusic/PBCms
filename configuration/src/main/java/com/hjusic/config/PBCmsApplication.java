package com.hjusic.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.hjusic")
@EnableMongoRepositories(basePackages = "com.hjusic")
public class PBCmsApplication {

    public static void main(String[] args){
        SpringApplication.run(PBCmsApplication.class, args);
    }
}
