package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.model.Item;
import org.first.stockmanagementservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam("keyword") String keyword) {
        return service.searchItems(keyword); // Update this method call
    }
}
