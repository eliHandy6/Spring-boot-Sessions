package com.inventory.inventorysystem.service.user;

import com.inventory.inventorysystem.model.user.User;
import com.inventory.inventorysystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@Service
@RequiredArgsConstructor
 class UserServiceImpl implements UserService{

     private final UserRepository userRepository;

    @Override
    public List<User> getAllUsersUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
