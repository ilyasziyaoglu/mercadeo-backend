package com.andriambavy.ecom.limitededition.mapper;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.client.limitededition.LimitedEditionResponse;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
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
public class LimitedEditionMapperImpl implements LimitedEditionMapper {

    @Override
    public LimitedEdition toEntity(LimitedEditionRequest request) {
        if ( request == null ) {
            return null;
        }

        LimitedEdition limitedEdition = new LimitedEdition();

        limitedEdition.setId( request.getId() );

        return limitedEdition;
    }

    @Override
    public LimitedEditionResponse toResponse(LimitedEdition entity) {
        if ( entity == null ) {
            return null;
        }

        LimitedEditionResponse limitedEditionResponse = new LimitedEditionResponse();

        limitedEditionResponse.setId( entity.getId() );
        limitedEditionResponse.setProductId( entity.getProductId() );
        limitedEditionResponse.setName( entity.getName() );
        limitedEditionResponse.setCategory( entity.getCategory() );
        limitedEditionResponse.setPrice( entity.getPrice() );
        limitedEditionResponse.setVideoUrl( entity.getVideoUrl() );
        limitedEditionResponse.setImgUrl( entity.getImgUrl() );
        limitedEditionResponse.setImgUrls( entity.getImgUrls() );
        limitedEditionResponse.setColorName( entity.getColorName() );
        limitedEditionResponse.setColorCode( entity.getColorCode() );
        limitedEditionResponse.setStatus( entity.getStatus() );

        return limitedEditionResponse;
    }

    @Override
    public List<LimitedEdition> toEntity(List<LimitedEditionRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<LimitedEdition> list = new ArrayList<LimitedEdition>( requestList.size() );
        for ( LimitedEditionRequest limitedEditionRequest : requestList ) {
            list.add( toEntity( limitedEditionRequest ) );
        }

        return list;
    }

    @Override
    public List<LimitedEditionResponse> toResponse(List<LimitedEdition> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<LimitedEditionResponse> list = new ArrayList<LimitedEditionResponse>( requestList.size() );
        for ( LimitedEdition limitedEdition : requestList ) {
            list.add( toResponse( limitedEdition ) );
        }

        return list;
    }
}
