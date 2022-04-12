package com.hjusic.common.model

import com.hjusic.common.model.user.Role
import com.hjusic.common.model.user.User
import spock.lang.Specification

class RoleTest extends Specification{

    def "should create role"() {
        given:
            def role = new Role(UUID.randomUUID(), "ADMIN")
            assert role.role == "ADMIN"
    }
}
