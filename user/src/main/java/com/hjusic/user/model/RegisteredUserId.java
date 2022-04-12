package com.hjusic.user.model;

import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
public class RegisteredUserId {

    private UUID registeredUserId;

    private RegisteredUserId(UUID registeredUserId) {
        this.registeredUserId = registeredUserId;
    }

    public static RegisteredUserId from(UUID uuid){
        return new RegisteredUserId(uuid);
    }
}
