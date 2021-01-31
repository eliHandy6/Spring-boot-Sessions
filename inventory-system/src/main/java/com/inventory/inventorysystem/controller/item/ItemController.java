package com.inventory.inventorysystem.controller.item;

import com.inventory.inventorysystem.model.item.Item;
import com.inventory.inventorysystem.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
@RestController()
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public Item addNewItem(@RequestBody Item item) {
        return itemService.addNewItem(item);
    }

    @GetMapping
    public List<Item> viewAll(){
        return itemService.getAllItems();
    }

}
