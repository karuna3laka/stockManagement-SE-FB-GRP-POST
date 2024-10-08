package org.first.stockmanagementservice.service;

import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.OversizeTShirt;
import org.first.stockmanagementservice.repository.IOversizeTShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class OversizeTShirtService implements IOversizeTShirtService
{

    @Autowired
    private Environment environment;

    @Autowired
    private IOversizeTShirtRepository oversizeTShirtRepo;


    @Override//
    //              return type
    public ResponseDto<List<OversizeTShirt>> getAllOversizeTShirts()
    {
        try{
            List<OversizeTShirt> oversizeTShirts = oversizeTShirtRepo.findAll();
            if(oversizeTShirts.isEmpty()){
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("NOT_FOUND.oversizeTshirts"));
            }
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK,oversizeTShirts,environment.getProperty("OverSize T SHIRT FOUND"));
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("searching FAILED"));

        }

    }

    @Override
    public ResponseDto<OversizeTShirt> getOversizeTShirtById(long id) {
        try
        {
            OversizeTShirt oversizeTShirt = oversizeTShirtRepo.findById(id).orElse(null);
            if (oversizeTShirt == null)
            {
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("oversizet _NOT-FOUND"));
            }
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK,oversizeTShirt,environment.getProperty("overSize t FOUND !"));
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("findByID_FAILED !"));
        }
    }
    
    @Override
    public ResponseDto<OversizeTShirt> saveOversizeTShirt(OversizeTShirt oversizeTShirt)
    {
        try{
            if (Objects.isNull(oversizeTShirt.getItemType())){
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("OverSize T,S Type missing"));
            }

            if (Objects.isNull(oversizeTShirt.getGsmIndex( ))){
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("OverSize T,S Type missing"));
            }
            oversizeTShirtRepo.save(oversizeTShirt);
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK,oversizeTShirt, environment.getProperty( "Succesfull SAVED_OVERSIZE_T"));
        }catch (Exception e ){
            e.printStackTrace();
            return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "tShirt.save.failed" ) );
        }
    }
}
