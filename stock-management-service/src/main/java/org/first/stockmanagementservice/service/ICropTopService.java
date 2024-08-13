package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.CropTop;

import java.util.List;

public interface ICropTopService
{
    ResponseDto<List<CropTop>> getAllCropTops();

    ResponseDto<CropTop> getCropTopById(long id);

    ResponseDto<CropTop> saveCropTop(CropTop cropTop);
}
