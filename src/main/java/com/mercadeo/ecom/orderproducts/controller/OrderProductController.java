package com.mercadeo.ecom.orderproducts.controller;

import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.client.orderproduct.OrderProductResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import com.mercadeo.ecom.orderproducts.mapper.OrderProductMapper;
import com.mercadeo.ecom.orderproducts.service.OrderProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/order-product")
public class OrderProductController extends AbstractBaseController<OrderProductRequest, OrderProduct,
		OrderProductResponse, OrderProductMapper, OrderProductService> {
	private OrderProductService service;
	private OrderProductMapper mapper;

	public OrderProductController(OrderProductService service, OrderProductMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public OrderProductService getService() {
		return service;
	}

	public OrderProductMapper getMapper() {
		return mapper;
	}
}
