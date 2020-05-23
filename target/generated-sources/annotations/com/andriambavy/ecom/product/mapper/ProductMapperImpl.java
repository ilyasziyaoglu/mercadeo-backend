package com.andriambavy.ecom.product.mapper;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.client.product.ProductResponse;
import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.client.productmodel.ProductModelResponse;
import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.product.db.entity.Product;
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
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( request.getId() );
        product.setCode( request.getCode() );
        product.setName( request.getName() );
        product.setInfos( request.getInfos() );
        product.setCollection( request.getCollection() );
        product.setCategory( request.getCategory() );
        product.setTags( request.getTags() );
        product.setStatus( request.getStatus() );
        product.setProductModels( productModelRequestListToProductModelList( request.getProductModels() ) );

        return product;
    }

    @Override
    public ProductResponse toResponse(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( entity.getId() );
        productResponse.setCode( entity.getCode() );
        productResponse.setName( entity.getName() );
        productResponse.setInfos( entity.getInfos() );
        productResponse.setCollection( entity.getCollection() );
        productResponse.setCategory( entity.getCategory() );
        productResponse.setTags( entity.getTags() );
        productResponse.setStatus( entity.getStatus() );
        productResponse.setProductModels( productModelListToProductModelResponseList( entity.getProductModels() ) );

        return productResponse;
    }

    @Override
    public List<Product> toEntity(List<ProductRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( requestList.size() );
        for ( ProductRequest productRequest : requestList ) {
            list.add( toEntity( productRequest ) );
        }

        return list;
    }

    @Override
    public List<ProductResponse> toResponse(List<Product> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( requestList.size() );
        for ( Product product : requestList ) {
            list.add( toResponse( product ) );
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

    protected ProductModel productModelRequestToProductModel(ProductModelRequest productModelRequest) {
        if ( productModelRequest == null ) {
            return null;
        }

        ProductModel productModel = new ProductModel();

        productModel.setId( productModelRequest.getId() );
        productModel.setVideoUrl( productModelRequest.getVideoUrl() );
        productModel.setImgUrl( productModelRequest.getImgUrl() );
        productModel.setImgUrls( productModelRequest.getImgUrls() );
        productModel.setColorName( productModelRequest.getColorName() );
        productModel.setColorCode( productModelRequest.getColorCode() );
        productModel.setStatus( productModelRequest.getStatus() );
        productModel.setProductOptions( productOptionRequestListToProductOptionList( productModelRequest.getProductOptions() ) );

        return productModel;
    }

    protected List<ProductModel> productModelRequestListToProductModelList(List<ProductModelRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductModel> list1 = new ArrayList<ProductModel>( list.size() );
        for ( ProductModelRequest productModelRequest : list ) {
            list1.add( productModelRequestToProductModel( productModelRequest ) );
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

    protected ProductModelResponse productModelToProductModelResponse(ProductModel productModel) {
        if ( productModel == null ) {
            return null;
        }

        ProductModelResponse productModelResponse = new ProductModelResponse();

        productModelResponse.setId( productModel.getId() );
        productModelResponse.setVideoUrl( productModel.getVideoUrl() );
        productModelResponse.setImgUrl( productModel.getImgUrl() );
        productModelResponse.setImgUrls( productModel.getImgUrls() );
        productModelResponse.setColorName( productModel.getColorName() );
        productModelResponse.setColorCode( productModel.getColorCode() );
        productModelResponse.setStatus( productModel.getStatus() );
        productModelResponse.setProductOptions( productOptionListToProductOptionResponseList( productModel.getProductOptions() ) );

        return productModelResponse;
    }

    protected List<ProductModelResponse> productModelListToProductModelResponseList(List<ProductModel> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductModelResponse> list1 = new ArrayList<ProductModelResponse>( list.size() );
        for ( ProductModel productModel : list ) {
            list1.add( productModelToProductModelResponse( productModel ) );
        }

        return list1;
    }
}
