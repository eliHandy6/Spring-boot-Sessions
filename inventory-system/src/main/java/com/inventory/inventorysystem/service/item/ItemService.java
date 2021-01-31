package com.inventory.inventorysystem.service.item;

import com.inventory.inventorysystem.model.item.Item;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface ItemService  {

    Item addNewItem(Item item);

    List<Item> getAllItems();
}
