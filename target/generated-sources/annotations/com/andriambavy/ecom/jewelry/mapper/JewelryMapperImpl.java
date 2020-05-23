package com.andriambavy.ecom.jewelry.mapper;

import com.andriambavy.ecom.client.jewelry.JewelryRequest;
import com.andriambavy.ecom.client.jewelry.JewelryResponse;
import com.andriambavy.ecom.jewelry.db.entity.Jewelry;
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
public class JewelryMapperImpl implements JewelryMapper {

    @Override
    public Jewelry toEntity(JewelryRequest request) {
        if ( request == null ) {
            return null;
        }

        Jewelry jewelry = new Jewelry();

        jewelry.setId( request.getId() );

        return jewelry;
    }

    @Override
    public JewelryResponse toResponse(Jewelry entity) {
        if ( entity == null ) {
            return null;
        }

        JewelryResponse jewelryResponse = new JewelryResponse();

        jewelryResponse.setId( entity.getId() );
        jewelryResponse.setProductId( entity.getProductId() );
        jewelryResponse.setName( entity.getName() );
        jewelryResponse.setCategory( entity.getCategory() );
        jewelryResponse.setPrice( entity.getPrice() );
        jewelryResponse.setVideoUrl( entity.getVideoUrl() );
        jewelryResponse.setImgUrl( entity.getImgUrl() );
        jewelryResponse.setImgUrls( entity.getImgUrls() );
        jewelryResponse.setColorName( entity.getColorName() );
        jewelryResponse.setColorCode( entity.getColorCode() );
        jewelryResponse.setStatus( entity.getStatus() );

        return jewelryResponse;
    }

    @Override
    public List<Jewelry> toEntity(List<JewelryRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Jewelry> list = new ArrayList<Jewelry>( requestList.size() );
        for ( JewelryRequest jewelryRequest : requestList ) {
            list.add( toEntity( jewelryRequest ) );
        }

        return list;
    }

    @Override
    public List<JewelryResponse> toResponse(List<Jewelry> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<JewelryResponse> list = new ArrayList<JewelryResponse>( requestList.size() );
        for ( Jewelry jewelry : requestList ) {
            list.add( toResponse( jewelry ) );
        }

        return list;
    }
}
