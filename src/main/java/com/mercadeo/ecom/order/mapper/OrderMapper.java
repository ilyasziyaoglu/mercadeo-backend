package com.mercadeo.ecom.order.mapper;

import com.mercadeo.ecom.client.order.OrderRequest;
import com.mercadeo.ecom.client.order.OrderResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.order.db.entity.Order;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface OrderMapper extends BaseMapper<OrderRequest, Order, OrderResponse> {
}
