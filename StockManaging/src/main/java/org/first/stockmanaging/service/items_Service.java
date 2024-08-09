package org.first.stockmanaging.service;

import org.first.stockmanaging.model.Item;
import org.first.stockmanaging.repo.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class items_Service {

    @Autowired
    private itemRepo repo;

    public List<Item> getAllItems() {
       return repo.findAll();
    }
}
