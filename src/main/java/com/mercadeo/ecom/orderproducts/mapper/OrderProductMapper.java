package com.mercadeo.ecom.orderproducts.mapper;

import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.client.orderproduct.OrderProductResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface OrderProductMapper extends BaseMapper<OrderProductRequest, OrderProduct, OrderProductResponse> {
}
