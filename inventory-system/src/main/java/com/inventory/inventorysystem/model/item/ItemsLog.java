package com.inventory.inventorysystem.model.item;

import com.inventory.inventorysystem.model.action.Action;
import com.inventory.inventorysystem.model.user.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author : Odinga David
 * @since : 1/31/21, Sun
 */

@Data
@Entity
public class ItemsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Action action;
    private Date date_accessed;
    private int quantity;
}
