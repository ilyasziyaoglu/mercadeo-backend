package com.andriambavy.ecom.order.mapper;

import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.client.order.OrderResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.order.db.entity.Order;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface OrderMapper extends BaseMapper<OrderRequest, Order, OrderResponse> {
}
