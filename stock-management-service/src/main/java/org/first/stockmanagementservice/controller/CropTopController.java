package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.CropTop;
import org.first.stockmanagementservice.service.CropTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CropTopController implements ICropTopController
{
    @Autowired
    private Environment environment;

    @Autowired
    private CropTopService cropTopService;

    @Override
    public ResponseEntity<ResponseDto<List<CropTop>>> getAllCropTops()
    {
        return ResponseEntity.ok(cropTopService.getAllCropTops());
    }

    @Override
    public ResponseEntity<ResponseDto<CropTop>> getCropTopById(@PathVariable long id)
    {
        if (id == 0)
        {
            return ResponseEntity.badRequest().body(new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("id.missing")));
        }
        return ResponseEntity.ok(cropTopService.getCropTopById(id));
    }

    @Override
    public ResponseEntity<ResponseDto<CropTop>> saveCropTop(@RequestBody CropTop cropTop)
    {
        if (cropTop == null)
        {
            return ResponseEntity.badRequest().body(new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("request.body.missing")));
        }
        return ResponseEntity.ok(cropTopService.saveCropTop(cropTop));
    }
}
