package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.TShirt;

import java.util.List;

public interface ITShirtService
{
	ResponseDto<List<TShirt>> getAllTShirts();

	ResponseDto<TShirt> getTShirtById( long id );

	ResponseDto<TShirt> saveTShirt( TShirt tShirt );
}
