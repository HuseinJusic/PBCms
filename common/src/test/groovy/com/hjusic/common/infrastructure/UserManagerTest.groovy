package com.hjusic.common.infrastructure

import com.hjusic.common.model.infrastructure.UserManager
import com.hjusic.common.model.user.User
import com.hjusic.common.repository.UserRepository
import spock.lang.Specification

class UserManagerTest extends Specification{

    UserRepository userRepository = Mock()
    UserManager userManager = new UserManager()

//    def "should save User"() {
//        given:
//            def user = new User(UUID.randomUUID(), "Husein", "mail@me.com", "hashed password", Set.of())
//        when:
//            userManager.saveUser(user)
//        //then:
//           //1 * userRepository.save(_ as User) >> user
//    }
//
//    def "should delete User"() {
//        given:
//        def user = new User(UUID.randomUUID(), "Husein", "mail@me.com", "hashed password", Set.of())
//        when:
//        userManager.removeUser(user)
//        //then:
//        //1 * userRepository.delete(_ as User) >> null
//    }
}
