package com.hjusic.user.application;

import com.hjusic.common.model.result.Result;
import com.hjusic.config.security.service.PasswordManager;
import com.hjusic.user.model.RegisterUserEvent;
import com.hjusic.user.model.RegisteredUser;
import com.hjusic.user.model.RegisteredUsers;
import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegisterUserService {

    private final RegisteredUsers registeredUsers;
    private final PasswordManager passwordManager;

    public Either<Object, RegisteredUser> registerUser(String username, String email, String password){
        var registerUserEvent = RegisterUserEvent.now(username, email, passwordManager.encode(password));
        return Result.announceSuccess(registeredUsers.trigger(registerUserEvent));
    }
}
