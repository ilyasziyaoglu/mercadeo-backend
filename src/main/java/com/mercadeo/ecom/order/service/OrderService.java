package com.mercadeo.ecom.order.service;

import com.mercadeo.ecom.client.order.OrderRequest;
import com.mercadeo.ecom.client.order.OrderResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.order.db.entity.Order;
import com.mercadeo.ecom.order.db.repository.OrderRepository;
import com.mercadeo.ecom.order.mapper.OrderMapper;
import com.mercadeo.ecom.order.mapper.OrderUpdateMapper;
import org.springframework.stereotype.Service;

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
