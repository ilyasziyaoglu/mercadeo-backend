package com.mercadeo.ecom.order.controller;

import com.mercadeo.ecom.client.order.OrderRequest;
import com.mercadeo.ecom.client.order.OrderResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.order.db.entity.Order;
import com.mercadeo.ecom.order.mapper.OrderMapper;
import com.mercadeo.ecom.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/order")
public class OrderController extends AbstractBaseController<OrderRequest, Order, OrderResponse, OrderMapper, OrderService> {
	private OrderService service;
	private OrderMapper mapper;

	public OrderController(final OrderService service, final OrderMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public OrderService getService() {
		return service;
	}

	public OrderMapper getMapper() {
		return mapper;
	}
}
