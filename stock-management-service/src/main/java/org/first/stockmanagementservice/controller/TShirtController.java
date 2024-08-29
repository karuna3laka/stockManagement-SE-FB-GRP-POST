package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.TShirt;
import org.first.stockmanagementservice.service.TShirtService;
import org.first.stockmanagementservice.webSocket.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TShirtController implements ITShirtController
{
	@Autowired
	private Environment environment;

	@Autowired
	private TShirtService tShirtService;

	@Override
	public ResponseEntity<ResponseDto<List<TShirt>>> getAllTShirts()
	{
		return ResponseEntity.ok( tShirtService.getAllTShirts() );
	}

	@Override
	public ResponseEntity<ResponseDto<TShirt>> getTShirtById( @PathVariable long id )
	{
		if ( id == 0 )
		{
			return ResponseEntity.badRequest().body( new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "id.missing" ) ) );
		}
		return ResponseEntity.ok( tShirtService.getTShirtById( id ) );
	}

	@Override
	public ResponseEntity<ResponseDto<TShirt>> saveTShirt( @RequestBody TShirt tShirt )
	{
		if ( tShirt == null )
		{
			return ResponseEntity.badRequest().body( new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "request.body.missing" ) ) );
		}
		return ResponseEntity.ok( tShirtService.saveTShirt( tShirt ) );
	}

    @org.springframework.stereotype.Controller
    public static class Controller {

        @Autowired
        SimpMessagingTemplate simpMessagingTemplate;




    }
}
