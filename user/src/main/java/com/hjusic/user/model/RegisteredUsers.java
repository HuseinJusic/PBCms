package com.hjusic.user.model;

public interface RegisteredUsers {
    RegisteredUser trigger(RegisterUserEvent registerUserEvent);
}
