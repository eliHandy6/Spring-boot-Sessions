package com.inventory.inventorysystem.service.user;

import com.inventory.inventorysystem.model.user.User;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface UserService {

    List<User> getAllUsersUsers();

    User addUser(User user);
}
