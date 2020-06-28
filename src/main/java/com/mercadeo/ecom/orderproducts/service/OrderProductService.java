package com.mercadeo.ecom.orderproducts.service;

import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.client.orderproduct.OrderProductResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import com.mercadeo.ecom.orderproducts.db.repository.OrderProductRepository;
import com.mercadeo.ecom.orderproducts.mapper.OrderProductMapper;
import com.mercadeo.ecom.orderproducts.mapper.OrderProductUpdateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class OrderProductService extends AbstractBaseService<OrderProductRequest, OrderProduct, OrderProductResponse, OrderProductMapper> {
	final private OrderProductRepository repository;
	final private OrderProductMapper mapper;
	final private OrderProductUpdateMapper updateMapper;

	@Override
	public OrderProductRepository getRepository() {
		return repository;
	}

	@Override
	public OrderProductMapper getMapper() {
		return mapper;
	}

	@Override
	public OrderProductUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

}
