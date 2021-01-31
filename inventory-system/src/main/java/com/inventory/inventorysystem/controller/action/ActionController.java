package com.inventory.inventorysystem.controller.action;

import com.inventory.inventorysystem.model.action.Action;
import com.inventory.inventorysystem.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@RequestMapping("/actions")
@RestController
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;


    @PostMapping
    public boolean addAllActions() {
        return actionService.addAllActions();
    }


    @GetMapping
    public List<Action> viewAllActions() {
        return actionService.getAllActions();
    }

}
