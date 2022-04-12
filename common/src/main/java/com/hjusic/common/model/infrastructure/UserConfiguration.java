package com.hjusic.common.model.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    UserManager userManager(){
        return new UserManager();
    }
}
