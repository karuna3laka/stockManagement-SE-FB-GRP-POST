package org.first.stockmanagementservice.service;


import org.first.stockmanagementservice.constants.IConstants;
import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.CropTop;
import org.first.stockmanagementservice.repository.ICropTopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

import org.first.stockmanagementservice.dto.ResponseDto;
import org.first.stockmanagementservice.model.CropTop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CropTopService implements ICropTopService
{

    @Autowired
    private Environment environment;

    @Autowired
    private ICropTopRepository cropTopRepository;
    private CropTop CropTop;


    @Override
    public ResponseDto<List<CropTop>> getAllCropTops() {
        try {
            List<CropTop> cropTops = cropTopRepository.findAll();
            if (cropTops.isEmpty()) {
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("CROP_TOP_NOT_FOUND", "Crop Top not found!"));
            }
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK, cropTops, environment.getProperty("CROP_TOP_FOUND", "Crop Tops found successfully!"));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR, environment.getProperty("CROP_TOP_SEARCH_FAILED", "Crop Top search failed!"));
        }
    }


    @Override
    public ResponseDto<CropTop> getCropTopById(long id){
        try {
            CropTop cropTop = cropTopRepository.findById(id).orElse(null);
                if (cropTop == null)
            {
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("CROP_TOP NOT_FOUND"));
        }
        return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK, cropTop ,environment.getProperty("CROP_TOP FOUND !"));
    } catch ( Exception e )
    {
        e.printStackTrace();
        return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "CROPTOP SEARCG_FAILED" ) );
    }

}
    @Override
    public ResponseDto<CropTop> saveCropTop(CropTop croptop){
        try{
            if (Objects.isNull(croptop.getItemType())){
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("ITEM-TYPE IS EMPTY"));
            }
            if(Objects.isNull(croptop.getFabricMet())){
                return new ResponseDto<>(IConstants.RESPONSE_STATUS_ERROR,environment.getProperty("FABRIC METIRIAL IS EMPTY !"));
            }
            cropTopRepository.save(croptop);
            return new ResponseDto<>(IConstants.RESPONSE_STATUS_OK,croptop, environment.getProperty("CROP TOP SAVED SUCCESS!"));
        }
        catch ( Exception e )
        {
            e.printStackTrace();
            return new ResponseDto<>( IConstants.RESPONSE_STATUS_ERROR, environment.getProperty( "CROP_TOP SAVE FAILED !" ) );
        }
    }


}
