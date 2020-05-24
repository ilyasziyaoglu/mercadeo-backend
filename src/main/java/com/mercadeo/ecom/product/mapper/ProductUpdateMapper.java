package com.mercadeo.ecom.product.mapper;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.product.db.entity.Product;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ProductUpdateMapper implements BaseUpdateMapper<ProductRequest, Product> {

	@Override
	public Product toEntityForUpdate(ProductRequest request, Product entity) {
		return null;
	}
}
