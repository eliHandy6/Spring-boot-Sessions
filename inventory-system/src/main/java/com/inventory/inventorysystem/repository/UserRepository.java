package com.inventory.inventorysystem.repository;

import com.inventory.inventorysystem.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface UserRepository extends JpaRepository<User, Long> {


}
