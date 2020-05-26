package com.mercadeo.ecom.common.property.mapper;

import com.mercadeo.ecom.common.property.db.entity.Property;
import com.mercadeo.ecom.common.property.request.PropertyRequest;
import com.mercadeo.ecom.common.property.response.PropertyResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-26T21:43:14+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class PropetyMapperImpl implements PropetyMapper {

    @Override
    public Property toEntity(PropertyRequest request) {
        if ( request == null ) {
            return null;
        }

        Property property = new Property();

        property.setId( request.getId() );
        property.setKey( request.getKey() );
        property.setValue( request.getValue() );

        return property;
    }

    @Override
    public PropertyResponse toResponse(Property entity) {
        if ( entity == null ) {
            return null;
        }

        PropertyResponse propertyResponse = new PropertyResponse();

        propertyResponse.setId( entity.getId() );
        propertyResponse.setKey( entity.getKey() );
        propertyResponse.setValue( entity.getValue() );

        return propertyResponse;
    }

    @Override
    public List<Property> toEntity(List<PropertyRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Property> list = new ArrayList<Property>( requestList.size() );
        for ( PropertyRequest propertyRequest : requestList ) {
            list.add( toEntity( propertyRequest ) );
        }

        return list;
    }

    @Override
    public List<PropertyResponse> toResponse(List<Property> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<PropertyResponse> list = new ArrayList<PropertyResponse>( requestList.size() );
        for ( Property property : requestList ) {
            list.add( toResponse( property ) );
        }

        return list;
    }
}
