package org.first.stockmanaging.service;

import org.first.stockmanaging.model.Item;
import org.first.stockmanaging.model.subModels.Croptop;
import org.first.stockmanaging.model.subModels.OversizeT;
import org.first.stockmanaging.model.subModels.T_shirts;
import org.first.stockmanaging.repo.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class items_Service {

    @Autowired
    private itemRepo repo;

    public List<Item> getAllItems() {
        return repo.findAll();
    }

    public List<Croptop> getCroptopItems() {
        return repo.findAll()  // Fetch all items from the database
                .stream()    // Convert to a stream
                .filter(item -> item instanceof Croptop) // Filter for Croptop items
                .map(item -> (Croptop) item) // Cast to Croptop
                .collect(Collectors.toList()); // Collect the filtered items back into a list
    }

    public List<OversizeT> getOversizeTItems(){
        return repo.findAll()
                .stream()
                .filter(item -> item instanceof OversizeT)
                .map(item -> (OversizeT) item)
                .collect(Collectors.toList());
    }

    public List<T_shirts> getTShirtsItems() {
        return repo.findAll()
                .stream()
                .filter(item -> item instanceof T_shirts)
                .map(item -> (T_shirts) item)
                .collect(Collectors.toList());
    }

    public void addItems(Item item){
        Item.add(item);

    }
}
