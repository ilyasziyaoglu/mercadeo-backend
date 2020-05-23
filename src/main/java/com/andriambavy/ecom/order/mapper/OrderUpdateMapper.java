package com.andriambavy.ecom.order.mapper;

import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.order.db.entity.Order;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class OrderUpdateMapper implements BaseUpdateMapper<OrderRequest, Order> {

	@Override
	public Order toEntityForUpdate(OrderRequest request, Order entity) {
		return null;
	}
}
