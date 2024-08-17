package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.CropTop;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("croptops")
@CrossOrigin(origins = { "*" })
public interface ICropTopController
{
    @RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json")
    ResponseEntity<ResponseDto<List<CropTop>>> getAllCropTops();

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    ResponseEntity<ResponseDto<CropTop>> getCropTopById(@PathVariable long id);

    @RequestMapping(method = RequestMethod.POST, path = "", produces = "application/json")
    ResponseEntity<ResponseDto<CropTop>> saveCropTop(@RequestBody CropTop cropTop);
}
