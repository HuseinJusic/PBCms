package com.hjusic.user.model;

import com.hjusic.common.model.event.DomainEvent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterUserEvent implements DomainEvent {

    private UUID eventId;
    private UUID aggregateId;
    private Instant when;

    private String userName;
    private String password;
    private String email;

    public static RegisterUserEvent now(String userName, String email, String password){
        return new RegisterUserEvent(UUID.randomUUID(), UUID.randomUUID(), Instant.now(), userName, email, password);
    }

}
