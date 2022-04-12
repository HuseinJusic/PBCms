package com.hjusic.common.model.user;

import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "roles")
@Value
public class Role {

    @Id
    private UUID id;
    private String role;
}
