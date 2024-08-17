package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.model.Item;
import org.first.stockmanagementservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repo;

    public List<Item> searchItems(String keyword) {
        return repo.searchItemsByKeyword(keyword); // Update this method call
    }
}
