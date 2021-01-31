package com.inventory.inventorysystem.service.action;

import com.inventory.inventorysystem.model.action.Action;
import com.inventory.inventorysystem.model.action.Actiontype;
import com.inventory.inventorysystem.repository.action.ActionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;

    @Override
    public boolean addAllActions() {

        for (Actiontype type : Actiontype.values()) {

            if(!actionRepository.existsByAction(type)) {

                Action action = new Action();
                action.setAction(type);
                actionRepository.save(action);
            }
        }

        return true;
    }

    @Override
    public List<Action> getAllActions() {
        return actionRepository.findAll();
    }
}
