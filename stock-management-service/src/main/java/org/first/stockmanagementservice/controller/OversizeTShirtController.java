package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.OversizeTShirt;
import org.first.stockmanagementservice.service.OversizeTShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OversizeTShirtController implements IOversizeTShirtController
{
    @Autowired
    private Environment environment;

    @Autowired
    private OversizeTShirtService oversizeTShirtService;

    @Override
    public ResponseEntity<ResponseDto<List<OversizeTShirt>>> getAllOversizeTShirts()
    {
        return ResponseEntity.ok(oversizeTShirtService.getAllOversizeTShirts());
    }

    @Override
    public ResponseEntity<ResponseDto<OversizeTShirt>> getOversizeTShirtById(@PathVariable long id)
    {
        if (id == 0)
        {
            return ResponseEntity.badRequest().body(new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("id.missing")));
        }
        return ResponseEntity.ok(oversizeTShirtService.getOversizeTShirtById(id));
    }

    @Override
    public ResponseEntity<ResponseDto<OversizeTShirt>> saveOversizeTShirt(@RequestBody OversizeTShirt oversizeTShirt)
    {
        if (oversizeTShirt == null)
        {
            return ResponseEntity.badRequest().body(new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("request.body.missing")));
        }
        return ResponseEntity.ok(oversizeTShirtService.saveOversizeTShirt(oversizeTShirt));
    }
}
