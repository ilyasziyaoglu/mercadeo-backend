package com.andriambavy.ecom.order.mapper;

import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.client.order.OrderResponse;
import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.order.db.entity.Order;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-21T02:19:26+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toEntity(OrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( request.getId() );
        order.setUser( request.getUser() );
        order.setProductOptions( productOptionRequestListToProductOptionList( request.getProductOptions() ) );
        order.setBuyerNote( request.getBuyerNote() );
        order.setStatus( request.getStatus() );
        order.setShippingInfo( request.getShippingInfo() );
        order.setReason( request.getReason() );

        return order;
    }

    @Override
    public OrderResponse toResponse(Order entity) {
        if ( entity == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setId( entity.getId() );
        orderResponse.setUser( entity.getUser() );
        orderResponse.setProductOptions( productOptionListToProductOptionResponseList( entity.getProductOptions() ) );
        orderResponse.setBuyerNote( entity.getBuyerNote() );
        orderResponse.setStatus( entity.getStatus() );
        orderResponse.setHistory( entity.getHistory() );
        orderResponse.setShippingInfo( entity.getShippingInfo() );

        return orderResponse;
    }

    @Override
    public List<Order> toEntity(List<OrderRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( requestList.size() );
        for ( OrderRequest orderRequest : requestList ) {
            list.add( toEntity( orderRequest ) );
        }

        return list;
    }

    @Override
    public List<OrderResponse> toResponse(List<Order> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<OrderResponse> list = new ArrayList<OrderResponse>( requestList.size() );
        for ( Order order : requestList ) {
            list.add( toResponse( order ) );
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
