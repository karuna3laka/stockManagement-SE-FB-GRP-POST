package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.Item;
import org.first.stockmanagementservice.model.extraModels.StockWarning;
import org.springframework.stereotype.Service;


public interface ILimitWarningService {
    ResponseDto<StockWarning> processStocksLimit(Long itemId);

}
