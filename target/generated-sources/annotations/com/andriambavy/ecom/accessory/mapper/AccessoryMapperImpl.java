package com.andriambavy.ecom.accessory.mapper;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.client.accessory.AccessoryResponse;
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
public class AccessoryMapperImpl implements AccessoryMapper {

    @Override
    public Accessory toEntity(AccessoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Accessory accessory = new Accessory();

        accessory.setId( request.getId() );
        accessory.setName( request.getName() );
        accessory.setPrice( request.getPrice() );
        accessory.setMainCategory( request.getMainCategory() );
        accessory.setSubCategory( request.getSubCategory() );
        accessory.setScale( request.getScale() );
        accessory.setColors( request.getColors() );

        return accessory;
    }

    @Override
    public AccessoryResponse toResponse(Accessory entity) {
        if ( entity == null ) {
            return null;
        }

        AccessoryResponse accessoryResponse = new AccessoryResponse();

        accessoryResponse.setId( entity.getId() );
        accessoryResponse.setName( entity.getName() );
        accessoryResponse.setPrice( entity.getPrice() );
        accessoryResponse.setMainCategory( entity.getMainCategory() );
        accessoryResponse.setSubCategory( entity.getSubCategory() );
        accessoryResponse.setColors( entity.getColors() );
        accessoryResponse.setScale( entity.getScale() );

        return accessoryResponse;
    }

    @Override
    public List<Accessory> toEntity(List<AccessoryRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Accessory> list = new ArrayList<Accessory>( requestList.size() );
        for ( AccessoryRequest accessoryRequest : requestList ) {
            list.add( toEntity( accessoryRequest ) );
        }

        return list;
    }

    @Override
    public List<AccessoryResponse> toResponse(List<Accessory> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<AccessoryResponse> list = new ArrayList<AccessoryResponse>( requestList.size() );
        for ( Accessory accessory : requestList ) {
            list.add( toResponse( accessory ) );
        }

        return list;
    }
}
