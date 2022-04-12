package com.hjusic.user.graphql;

import com.hjusic.user.application.RegisterUserService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.hjusic.user.model.RegisteredUser;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class RegisterUserGraphQlService {

    private final RegisterUserService registerUserService;

    @DgsData(parentType = "Mutation", field = "registerUser")
    public RegisteredUser registeredUser(
            @InputArgument("email") String email,
            @InputArgument("password") String password,
            @InputArgument("username") String userName){

        return registerUserService.registerUser(userName, email, password).get();
    }
}
