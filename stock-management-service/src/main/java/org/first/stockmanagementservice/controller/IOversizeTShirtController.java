package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.OversizeTShirt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IOversizeTShirtController
{
    @GetMapping("/oversize-tshirts")
    ResponseEntity<ResponseDto<List<OversizeTShirt>>> getAllOversizeTShirts();

    @GetMapping("/oversize-tshirts/{id}")
    ResponseEntity<ResponseDto<OversizeTShirt>> getOversizeTShirtById(@PathVariable long id);

    @PostMapping("/oversize-tshirts")
    ResponseEntity<ResponseDto<OversizeTShirt>> saveOversizeTShirt(@RequestBody OversizeTShirt oversizeTShirt);
}
