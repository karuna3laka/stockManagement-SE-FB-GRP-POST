package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.TShirt;
import org.first.stockmanagementservice.repository.ITShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TShirtService implements ITShirtService
{
	@Autowired
	private Environment environment;

	@Autowired
	private ITShirtRepository tShirtRepository;

	@Override
	public ResponseDto<List<TShirt>> getAllTShirts()
	{
		try
		{
			List<TShirt> tShirts = tShirtRepository.findAll();
			if ( tShirts.isEmpty() )
			{
				return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirts.not.found" ) );
			}
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_OK, tShirts, environment.getProperty( "tShirts.found" ) );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirts.search.failed" ) );
		}
	}

	@Override
	public ResponseDto<TShirt> getTShirtById( long id )
	{
		try
		{
			TShirt tShirt = tShirtRepository.findById( id ).orElse( null );
			if ( tShirt == null )
			{
				return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirts.not.found" ) );
			}
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_OK, tShirt, environment.getProperty( "tShirts.found" ) );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirts.search.failed" ) );
		}
	}

	@Override
	public ResponseDto<TShirt> saveTShirt( TShirt tShirt )
	{
		try
		{
			if ( Objects.isNull( tShirt.getItemType() ) )
			{
				return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirt.type.missing" ) );
			}

			if ( Objects.isNull( tShirt.getSellerName() ) )
			{
				return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirt.seller.name.missing" ) );
			}
			//TODO: Do other validations (Ex: null check for mandatory fields)

			tShirtRepository.save( tShirt );
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_OK, tShirt, environment.getProperty( "tShirt.save.success" ) );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirt.save.failed" ) );
		}
	}
}
