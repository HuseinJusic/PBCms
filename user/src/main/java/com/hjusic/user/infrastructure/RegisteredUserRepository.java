package com.hjusic.user.infrastructure;

import com.hjusic.common.model.event.DomainEvents;
import com.hjusic.common.model.infrastructure.UserManager;
import com.hjusic.common.model.user.User;
import com.hjusic.common.repository.UserRepository;
import com.hjusic.user.model.RegisterUserEvent;
import com.hjusic.user.model.RegisteredUser;
import com.hjusic.user.model.RegisteredUserId;
import com.hjusic.user.model.RegisteredUsers;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class RegisteredUserRepository implements RegisteredUsers {

    private final UserManager userManager;
    private final DomainEvents domainEvents;

    @Override
    public RegisteredUser trigger(RegisterUserEvent registerUserEvent) {
        var user = new User(registerUserEvent.getAggregateId(), registerUserEvent.getUserName(), registerUserEvent.getEmail(), registerUserEvent.getPassword(), Set.of());
        var registeredUer = DomainModelMapper.map(userManager.saveUser(user));
        domainEvents.publish(registerUserEvent);
        return registeredUer;
    }

    private class DomainModelMapper {

        private static RegisteredUser map(User user){
            return RegisteredUser.from(
                    RegisteredUserId.from(user.getId()),
                    user.getUsername(),
                    user.getEmail(),
                    user.getPassword()
            );
        }
    }
}
