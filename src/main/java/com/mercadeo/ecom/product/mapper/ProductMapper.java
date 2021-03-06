package com.mercadeo.ecom.product.mapper;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.product.db.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<ProductRequest, Product, ProductResponse> {
	List<ProductFilterResponse> toFilterResponse(List<Product> products);
}
