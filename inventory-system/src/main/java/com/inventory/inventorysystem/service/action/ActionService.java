package com.inventory.inventorysystem.service.action;

import com.inventory.inventorysystem.model.action.Action;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface ActionService {

    boolean addAllActions();

    List<Action> getAllActions();
}
