package com.inventory.inventorysystem.repository.item;

import com.inventory.inventorysystem.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */
public interface ItempRepository  extends JpaRepository<Item, Long> {
}
