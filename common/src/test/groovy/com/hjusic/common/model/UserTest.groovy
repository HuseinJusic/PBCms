package com.hjusic.common.model

import com.hjusic.common.model.user.User
import spock.lang.Specification

class UserTest extends Specification{

    def "should create user"() {
        given:
            def user = new User(UUID.randomUUID(), "Husein", "mail@me.com", "hashed password", Set.of())
            assert user.getUsername() == "Husein"
            assert user.getEmail() == "mail@me.com"
            assert user.getPassword() == "hashed password"
            assert user.getRoles().isEmpty()
    }
}
