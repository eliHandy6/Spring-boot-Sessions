package com.inventory.inventorysystem.service.item;

import com.inventory.inventorysystem.model.item.Item;
import com.inventory.inventorysystem.repository.item.ItempRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@RequiredArgsConstructor
@Service
class ItemServiceImp implements ItemService {

    private final ItempRepository itempRepository;

    @Override
    public Item addNewItem(Item item) {
        return itempRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itempRepository.findAll();
    }
}
