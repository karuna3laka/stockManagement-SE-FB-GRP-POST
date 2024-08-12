package org.first.stockmanaging.controller;

import org.first.stockmanaging.model.Item;
import org.first.stockmanaging.model.subModels.Croptop;
import org.first.stockmanaging.model.subModels.OversizeT;
import org.first.stockmanaging.model.subModels.T_shirts;
import org.first.stockmanaging.service.items_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class items_Controller {

    @Autowired
    private items_Service service;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        List<Item> items = service.getAllItems();
        System.out.println("Items retrieved: " + items);
        return items;
        //jjjjjjjjjjj
    }

    @GetMapping("/items/croptop")
    public List<Croptop> getFilteredByCroptop() {
        return service.getCroptopItems();
    }

    @GetMapping("/items/oversizet")
    public List<OversizeT> getFilteredByOversizeT() {
        return service.getOversizeTItems();
    }

    @GetMapping("/items/shirts")
    public List<T_shirts> getFilteredByTShirts() {
        return service.getTShirtsItems();
    }
}
