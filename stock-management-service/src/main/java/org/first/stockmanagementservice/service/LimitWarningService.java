package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.Item;
import org.first.stockmanagementservice.model.extraModels.StockWarning;
import org.first.stockmanagementservice.repository.IItemRepository;
import org.first.stockmanagementservice.repository.ILimitWarningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LimitWarningService implements ILimitWarningService {

    @Autowired
    private IItemRepository iitemRepository;

    @Autowired
    private ILimitWarningRepository limitWarningRepository;

    private static final int WARNING_LIMIT = 2 ;


    public ResponseDto<StockWarning> processStocksLimit(Long itemId) {
        Item item = iitemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item not found"));

        int quantity = item.getQuantity();

        if (quantity <=  WARNING_LIMIT) {
            StockWarning warning = new StockWarning("Stock is critically low! Only " + quantity + " items left.");
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK, warning, "Warning: Stock is running out!");
        } else {
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK, null, "Stock level is sufficient.");
        }
    }
}
