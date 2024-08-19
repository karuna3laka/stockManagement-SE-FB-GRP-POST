package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.Item;
import org.first.stockmanagementservice.model.extraModels.StockWarning;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping("/check-stocks")
public interface ILimitWarningController {

    @RequestMapping(method = RequestMethod.GET, path = "/{itemId}", produces = "application/json")
    ResponseEntity<ResponseDto<StockWarning>> checkStocks(@PathVariable Long itemId);

//    @RequestMapping(method = RequestMethod.POST, path = "/process", produces = "application/json")
//    ResponseEntity<ResponseDto<StockWarning>> processStocksLimit(@RequestBody Item item);
}
