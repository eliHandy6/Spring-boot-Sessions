package com.inventory.inventorysystem.model.item;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double unit_price;
    private String description;
    private String name;
    private String quantity;
}
