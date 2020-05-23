package com.andriambavy.ecom.productmodel.mapper;

import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.client.productmodel.ProductModelResponse;
import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.productmodel.db.entity.ProductModel;
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
public class ProductModelMapperImpl implements ProductModelMapper {

    @Override
    public ProductModel toEntity(ProductModelRequest request) {
        if ( request == null ) {
            return null;
        }

        ProductModel productModel = new ProductModel();

        productModel.setId( request.getId() );
        productModel.setVideoUrl( request.getVideoUrl() );
        productModel.setImgUrl( request.getImgUrl() );
        productModel.setImgUrls( request.getImgUrls() );
        productModel.setColorName( request.getColorName() );
        productModel.setColorCode( request.getColorCode() );
        productModel.setStatus( request.getStatus() );
        productModel.setProductOptions( productOptionRequestListToProductOptionList( request.getProductOptions() ) );

        return productModel;
    }

    @Override
    public ProductModelResponse toResponse(ProductModel entity) {
        if ( entity == null ) {
            return null;
        }

        ProductModelResponse productModelResponse = new ProductModelResponse();

        productModelResponse.setId( entity.getId() );
        productModelResponse.setVideoUrl( entity.getVideoUrl() );
        productModelResponse.setImgUrl( entity.getImgUrl() );
        productModelResponse.setImgUrls( entity.getImgUrls() );
        productModelResponse.setColorName( entity.getColorName() );
        productModelResponse.setColorCode( entity.getColorCode() );
        productModelResponse.setStatus( entity.getStatus() );
        productModelResponse.setProductOptions( productOptionListToProductOptionResponseList( entity.getProductOptions() ) );

        return productModelResponse;
    }

    @Override
    public List<ProductModel> toEntity(List<ProductModelRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductModel> list = new ArrayList<ProductModel>( requestList.size() );
        for ( ProductModelRequest productModelRequest : requestList ) {
            list.add( toEntity( productModelRequest ) );
        }

        return list;
    }

    @Override
    public List<ProductModelResponse> toResponse(List<ProductModel> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductModelResponse> list = new ArrayList<ProductModelResponse>( requestList.size() );
        for ( ProductModel productModel : requestList ) {
            list.add( toResponse( productModel ) );
        }

        return list;
    }

    protected ProductOption productOptionRequestToProductOption(ProductOptionRequest productOptionRequest) {
        if ( productOptionRequest == null ) {
            return null;
        }

        ProductOption productOption = new ProductOption();

        productOption.setId( productOptionRequest.getId() );
        productOption.setPrice( productOptionRequest.getPrice() );
        productOption.setStock( productOptionRequest.getStock() );
        productOption.setProductSize( productOptionRequest.getProductSize() );
        productOption.setSizeMeasures( productOptionRequest.getSizeMeasures() );

        return productOption;
    }

    protected List<ProductOption> productOptionRequestListToProductOptionList(List<ProductOptionRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductOption> list1 = new ArrayList<ProductOption>( list.size() );
        for ( ProductOptionRequest productOptionRequest : list ) {
            list1.add( productOptionRequestToProductOption( productOptionRequest ) );
        }

        return list1;
    }

    protected ProductOptionResponse productOptionToProductOptionResponse(ProductOption productOption) {
        if ( productOption == null ) {
            return null;
        }

        ProductOptionResponse productOptionResponse = new ProductOptionResponse();

        productOptionResponse.setId( productOption.getId() );
        productOptionResponse.setPrice( productOption.getPrice() );
        productOptionResponse.setStock( productOption.getStock() );
        productOptionResponse.setProductSize( productOption.getProductSize() );
        productOptionResponse.setSizeMeasures( productOption.getSizeMeasures() );

        return productOptionResponse;
    }

    protected List<ProductOptionResponse> productOptionListToProductOptionResponseList(List<ProductOption> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductOptionResponse> list1 = new ArrayList<ProductOptionResponse>( list.size() );
        for ( ProductOption productOption : list ) {
            list1.add( productOptionToProductOptionResponse( productOption ) );
        }

        return list1;
    }
}
