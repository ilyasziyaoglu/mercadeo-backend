package com.andriambavy.ecom.order.service;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.client.order.OrderResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.order.db.entity.Order;
import com.andriambavy.ecom.order.db.repository.OrderRepository;
import com.andriambavy.ecom.order.mapper.OrderMapper;
import com.andriambavy.ecom.order.mapper.OrderUpdateMapper;
import com.andriambavy.ecom.productoption.mapper.ProductOptionMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class OrderService extends AbstractBaseService<OrderRequest, Order, OrderResponse, OrderMapper> {
    private OrderRepository repository;
    private OrderMapper mapper;
    private OrderUpdateMapper updateMapper;

    public OrderService(OrderRepository repository, OrderMapper mapper, OrderUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public OrderRepository getRepository() {
        return repository;
    }

    @Override
    public OrderMapper getMapper() {
        return mapper;
    }

    @Override
    public OrderUpdateMapper getUpdateMapper() {
        return updateMapper;
    }
}
