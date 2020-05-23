package com.andriambavy.ecom.product.mapper;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.client.product.ProductResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.product.db.entity.Product;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<ProductRequest, Product, ProductResponse> {
}
