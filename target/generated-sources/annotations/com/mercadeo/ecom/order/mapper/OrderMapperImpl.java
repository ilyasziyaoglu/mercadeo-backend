package com.mercadeo.ecom.order.mapper;

import com.mercadeo.ecom.client.order.OrderRequest;
import com.mercadeo.ecom.client.order.OrderResponse;
import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.client.orderproduct.OrderProductResponse;
import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.client.user.UserResponse;
import com.mercadeo.ecom.order.db.entity.Order;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import com.mercadeo.ecom.user.db.entity.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-08T00:14:27+0300",
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
        order.setUser( userRequestToUser( request.getUser() ) );
        order.setBuyerNote( request.getBuyerNote() );
        order.setStatus( request.getStatus() );
        order.setShippingInfo( request.getShippingInfo() );
        order.setReason( request.getReason() );
        order.setReceiverName( request.getReceiverName() );
        order.setReceiverPhone( request.getReceiverPhone() );
        order.setReceiverEmail( request.getReceiverEmail() );
        order.setReceiverAddress( request.getReceiverAddress() );
        order.setOrderProducts( orderProductRequestSetToOrderProductSet( request.getOrderProducts() ) );

        return order;
    }

    @Override
    public OrderResponse toResponse(Order entity) {
        if ( entity == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setId( entity.getId() );
        orderResponse.setUser( userToUserResponse( entity.getUser() ) );
        orderResponse.setBuyerNote( entity.getBuyerNote() );
        orderResponse.setStatus( entity.getStatus() );
        orderResponse.setHistory( entity.getHistory() );
        orderResponse.setShippingInfo( entity.getShippingInfo() );
        orderResponse.setReason( entity.getReason() );
        orderResponse.setReceiverName( entity.getReceiverName() );
        orderResponse.setReceiverPhone( entity.getReceiverPhone() );
        orderResponse.setReceiverEmail( entity.getReceiverEmail() );
        orderResponse.setReceiverAddress( entity.getReceiverAddress() );
        orderResponse.setOrderProducts( orderProductSetToOrderProductResponseSet( entity.getOrderProducts() ) );

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

    protected User userRequestToUser(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( userRequest.getUsername() );
        user.setId( userRequest.getId() );
        user.setPassword( userRequest.getPassword() );
        user.setFullName( userRequest.getFullName() );
        user.setImageUrl( userRequest.getImageUrl() );
        user.setEmail( userRequest.getEmail() );
        user.setGender( userRequest.getGender() );
        user.setCountry( userRequest.getCountry() );
        user.setPhone( userRequest.getPhone() );
        user.setAddresses( userRequest.getAddresses() );
        user.setRoles( userRequest.getRoles() );

        return user;
    }

    protected OrderProduct orderProductRequestToOrderProduct(OrderProductRequest orderProductRequest) {
        if ( orderProductRequest == null ) {
            return null;
        }

        OrderProduct orderProduct = new OrderProduct();

        orderProduct.setId( orderProductRequest.getId() );
        orderProduct.setProductId( orderProductRequest.getProductId() );
        Set<Long> set = orderProductRequest.getColorIds();
        if ( set != null ) {
            orderProduct.setColorIds( new HashSet<Long>( set ) );
        }
        Set<Long> set1 = orderProductRequest.getSizeIds();
        if ( set1 != null ) {
            orderProduct.setSizeIds( new HashSet<Long>( set1 ) );
        }

        return orderProduct;
    }

    protected Set<OrderProduct> orderProductRequestSetToOrderProductSet(Set<OrderProductRequest> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderProduct> set1 = new HashSet<OrderProduct>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderProductRequest orderProductRequest : set ) {
            set1.add( orderProductRequestToOrderProduct( orderProductRequest ) );
        }

        return set1;
    }

    protected UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( user.getId() );
        userResponse.setUsername( user.getUsername() );
        userResponse.setFullName( user.getFullName() );
        userResponse.setImageUrl( user.getImageUrl() );
        userResponse.setEmail( user.getEmail() );
        userResponse.setPhone( user.getPhone() );
        userResponse.setAddresses( user.getAddresses() );
        userResponse.setRoles( user.getRoles() );
        userResponse.setGender( user.getGender() );
        userResponse.setCountry( user.getCountry() );

        return userResponse;
    }

    protected OrderProductResponse orderProductToOrderProductResponse(OrderProduct orderProduct) {
        if ( orderProduct == null ) {
            return null;
        }

        OrderProductResponse orderProductResponse = new OrderProductResponse();

        orderProductResponse.setId( orderProduct.getId() );

        return orderProductResponse;
    }

    protected Set<OrderProductResponse> orderProductSetToOrderProductResponseSet(Set<OrderProduct> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderProductResponse> set1 = new HashSet<OrderProductResponse>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderProduct orderProduct : set ) {
            set1.add( orderProductToOrderProductResponse( orderProduct ) );
        }

        return set1;
    }
}
