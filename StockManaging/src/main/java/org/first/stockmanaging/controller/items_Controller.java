package org.first.stockmanaging.controller;

import org.first.stockmanaging.model.Item;
import org.first.stockmanaging.service.items_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class items_Controller {

    @Autowired
    private items_Service service;



//    public int whichItem(){
//        return 1 ;
//    }
    @RequestMapping("/items")
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

}
