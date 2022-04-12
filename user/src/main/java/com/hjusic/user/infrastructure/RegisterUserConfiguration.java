package com.hjusic.user.infrastructure;

import com.hjusic.common.model.event.DomainEvents;
import com.hjusic.common.model.infrastructure.UserManager;
import com.hjusic.config.security.service.PasswordManager;
import com.hjusic.user.application.RegisterUserService;
import com.hjusic.user.graphql.RegisterUserGraphQlService;
import com.hjusic.user.model.RegisteredUsers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterUserConfiguration {

    @Bean
    RegisterUserGraphQlService registerUserGraphQlService(RegisterUserService registerUserService){
        return new RegisterUserGraphQlService(registerUserService);
    }

    @Bean
    RegisterUserService registerUserService(RegisteredUsers registeredUsers, PasswordManager passwordManager){
        return new RegisterUserService(registeredUsers, passwordManager);
    }

    @Bean
    RegisteredUserRepository registeredUserRepository(UserManager userManager, DomainEvents domainEvents){
        return new RegisteredUserRepository(userManager, domainEvents);
    }

    @Bean
    RegisteredUsers registeredUsers(UserManager userManager, DomainEvents domainEvents){
        return new RegisteredUserRepository(userManager, domainEvents);
    }
}
