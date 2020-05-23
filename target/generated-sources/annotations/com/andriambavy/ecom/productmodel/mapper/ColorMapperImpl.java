package com.andriambavy.ecom.productmodel.mapper;

import com.andriambavy.ecom.client.productmodel.ColorResponse;
import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.productmodel.db.entity.Color;
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
public class ColorMapperImpl implements ColorMapper {

    @Override
    public Color toEntity(ProductModelRequest request) {
        if ( request == null ) {
            return null;
        }

        Color color = new Color();

        color.setId( request.getId() );
        color.setColorName( request.getColorName() );
        color.setColorCode( request.getColorCode() );

        return color;
    }

    @Override
    public ColorResponse toResponse(Color entity) {
        if ( entity == null ) {
            return null;
        }

        ColorResponse colorResponse = new ColorResponse();

        colorResponse.setId( entity.getId() );
        colorResponse.setColorName( entity.getColorName() );
        colorResponse.setColorCode( entity.getColorCode() );

        return colorResponse;
    }

    @Override
    public List<Color> toEntity(List<ProductModelRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Color> list = new ArrayList<Color>( requestList.size() );
        for ( ProductModelRequest productModelRequest : requestList ) {
            list.add( toEntity( productModelRequest ) );
        }

        return list;
    }

    @Override
    public List<ColorResponse> toResponse(List<Color> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ColorResponse> list = new ArrayList<ColorResponse>( requestList.size() );
        for ( Color color : requestList ) {
            list.add( toResponse( color ) );
        }

        return list;
    }
}
