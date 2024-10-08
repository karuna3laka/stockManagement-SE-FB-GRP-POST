package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.TShirt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("tShirts")
@CrossOrigin(origins = { "*" })
public interface ITShirtController
{
	@RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json")
	ResponseEntity<ResponseDto<List<TShirt>>> getAllTShirts();

	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
	ResponseEntity<ResponseDto<TShirt>> getTShirtById( @PathVariable long id );

	@RequestMapping(method = RequestMethod.POST, path = "", produces = "application/json")
	ResponseEntity<ResponseDto<TShirt>> saveTShirt( @RequestBody TShirt tShirt );

	//This annotation tells Spring to take the JSON data from the incoming POST request,
	// convert it into an OversizeTShirt object, and pass it to this method as a parameter.
	// Essentially, it's how the server receives and understands the data sent by the client.
}
