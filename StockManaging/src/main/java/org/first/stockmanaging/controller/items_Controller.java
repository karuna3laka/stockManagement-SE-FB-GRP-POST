package org.first.stockmanaging.controller;

import org.first.stockmanaging.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class items_Controller {

    @RequestMapping("/items")
    public int whichItem(){
        return 1 ;
    }

}
