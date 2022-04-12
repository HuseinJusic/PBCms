package com.hjusic.user.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisteredUser {

    private RegisteredUserId registeredUserId;
    private String userName;
    private String password;
    private String email;

    private RegisteredUser(RegisteredUserId registeredUserId, String userName,String email, String password) {
        this.registeredUserId = registeredUserId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public static RegisteredUser from(RegisteredUserId registeredUserId, String userName, String email, String password){
        return new RegisteredUser(registeredUserId, userName, email, password);
    }


}
