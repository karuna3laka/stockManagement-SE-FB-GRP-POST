package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.OversizeTShirt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("oversize-tshirts")
@CrossOrigin(origins = { "*" })
public interface IOversizeTShirtController
{
    @RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json")
    ResponseEntity<ResponseDto<List<OversizeTShirt>>> getAllOversizeTShirts();

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    ResponseEntity<ResponseDto<OversizeTShirt>> getOversizeTShirtById(@PathVariable long id);

    @RequestMapping(method = RequestMethod.POST, path = "", produces = "application/json")
    ResponseEntity<ResponseDto<OversizeTShirt>> saveOversizeTShirt(@RequestBody OversizeTShirt oversizeTShirt);
}
