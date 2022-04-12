package com.hjusic.common.model.infrastructure;

import com.hjusic.common.model.user.User;
import com.hjusic.common.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class UserManager {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void removeUser(User user){
        userRepository.delete(user);
    }
}
