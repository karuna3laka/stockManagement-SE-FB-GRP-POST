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

    @GetMapping("/croptops")
    ResponseEntity<ResponseDto<List<CropTop>>> getAllCropTops();

    @GetMapping("/croptops/{id}")
    ResponseEntity<ResponseDto<CropTop>> getCropTopById(@PathVariable long id);

    @PostMapping("/croptops"
    ResponseEntity<ResponseDto<CropTop>> saveCropTop(@RequestBody CropTop cropTop);
}
