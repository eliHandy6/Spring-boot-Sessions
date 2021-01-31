package com.inventory.inventorysystem.repository.action;

import com.inventory.inventorysystem.model.action.Action;
import com.inventory.inventorysystem.model.action.Actiontype;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface ActionRepository extends JpaRepository<Action, Long> {

    boolean existsByAction(Actiontype action);
}
