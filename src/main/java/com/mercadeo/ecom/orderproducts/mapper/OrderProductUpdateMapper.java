package com.mercadeo.ecom.orderproducts.mapper;

import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class OrderProductUpdateMapper implements BaseUpdateMapper<OrderProductRequest, OrderProduct> {

	@Override
	public OrderProduct toEntityForUpdate(OrderProductRequest request, OrderProduct entity) {
		return null;
	}
}
