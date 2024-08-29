package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.extraModels.StockWarning;
import org.first.stockmanagementservice.service.LimitWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitWarningController implements ILimitWarningController {

    @Autowired
    private LimitWarningService limitWarningService;

    public ResponseEntity<ResponseDto<StockWarning>> checkStocks(@PathVariable Long itemId) {
        ResponseDto<StockWarning> response = limitWarningService.processStocksLimit(itemId);
        return new ResponseEntity<>(response, HttpStatus.OK);


    }

    public ResponseEntity<ResponseDto<StockWarning>> checkStocks(@PathVariable String itemType) {
        ResponseDto<StockWarning> response = limitWarningService.processStocksLimit(itemType);
        return new ResponseEntity<>(response, HttpStatus.OK);


    }
}
