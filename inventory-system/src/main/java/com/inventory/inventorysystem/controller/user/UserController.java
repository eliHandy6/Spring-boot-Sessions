package com.inventory.inventorysystem.controller.user;

import com.inventory.inventorysystem.model.user.User;
import com.inventory.inventorysystem.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }


    @GetMapping
    public List<User> getList() {
        return userService.getAllUsersUsers();
    }
}
