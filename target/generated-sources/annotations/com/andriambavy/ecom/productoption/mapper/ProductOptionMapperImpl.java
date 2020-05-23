package com.andriambavy.ecom.productoption.mapper;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
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
public class ProductOptionMapperImpl implements ProductOptionMapper {

    @Override
    public ProductOption toEntity(ProductOptionRequest request) {
        if ( request == null ) {
            return null;
        }

        ProductOption productOption = new ProductOption();

        productOption.setId( request.getId() );
        productOption.setPrice( request.getPrice() );
        productOption.setStock( request.getStock() );
        productOption.setProductSize( request.getProductSize() );
        productOption.setSizeMeasures( request.getSizeMeasures() );

        return productOption;
    }

    @Override
    public ProductOptionResponse toResponse(ProductOption entity) {
        if ( entity == null ) {
            return null;
        }

        ProductOptionResponse productOptionResponse = new ProductOptionResponse();

        productOptionResponse.setId( entity.getId() );
        productOptionResponse.setPrice( entity.getPrice() );
        productOptionResponse.setStock( entity.getStock() );
        productOptionResponse.setProductSize( entity.getProductSize() );
        productOptionResponse.setSizeMeasures( entity.getSizeMeasures() );

        return productOptionResponse;
    }

    @Override
    public List<ProductOption> toEntity(List<ProductOptionRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductOption> list = new ArrayList<ProductOption>( requestList.size() );
        for ( ProductOptionRequest productOptionRequest : requestList ) {
            list.add( toEntity( productOptionRequest ) );
        }

        return list;
    }

    @Override
    public List<ProductOptionResponse> toResponse(List<ProductOption> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductOptionResponse> list = new ArrayList<ProductOptionResponse>( requestList.size() );
        for ( ProductOption productOption : requestList ) {
            list.add( toResponse( productOption ) );
        }

        return list;
    }
}
