package com.andriambavy.ecom.modelaccessory.mapper;

import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryRequest;
import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryResponse;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-21T02:19:25+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class ModelAccessoryMapperImpl implements ModelAccessoryMapper {

    @Override
    public ModelAccessory toEntity(ModelAccessoryRequest request) {
        if ( request == null ) {
            return null;
        }

        ModelAccessory modelAccessory = new ModelAccessory();

        modelAccessory.setId( request.getId() );
        modelAccessory.setModelId( request.getModelId() );
        modelAccessory.setAccessoryId( request.getAccessoryId() );
        modelAccessory.setProps( request.getProps() );

        return modelAccessory;
    }

    @Override
    public ModelAccessoryResponse toResponse(ModelAccessory entity) {
        if ( entity == null ) {
            return null;
        }

        ModelAccessoryResponse modelAccessoryResponse = new ModelAccessoryResponse();

        modelAccessoryResponse.setId( entity.getId() );
        modelAccessoryResponse.setModelId( entity.getModelId() );
        modelAccessoryResponse.setAccessoryId( entity.getAccessoryId() );
        modelAccessoryResponse.setProps( entity.getProps() );

        return modelAccessoryResponse;
    }

    @Override
    public List<ModelAccessory> toEntity(List<ModelAccessoryRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ModelAccessory> list = new ArrayList<ModelAccessory>( requestList.size() );
        for ( ModelAccessoryRequest modelAccessoryRequest : requestList ) {
            list.add( toEntity( modelAccessoryRequest ) );
        }

        return list;
    }

    @Override
    public List<ModelAccessoryResponse> toResponse(List<ModelAccessory> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ModelAccessoryResponse> list = new ArrayList<ModelAccessoryResponse>( requestList.size() );
        for ( ModelAccessory modelAccessory : requestList ) {
            list.add( toResponse( modelAccessory ) );
        }

        return list;
    }
}
