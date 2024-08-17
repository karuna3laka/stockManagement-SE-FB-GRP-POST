package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.OversizeTShirt;

import java.util.List;

public interface IOversizeTShirtService
{
    ResponseDto<List<OversizeTShirt>> getAllOversizeTShirts();

    ResponseDto<OversizeTShirt> getOversizeTShirtById(long id);

    ResponseDto<OversizeTShirt> saveOversizeTShirt(OversizeTShirt oversizeTShirt);
}
