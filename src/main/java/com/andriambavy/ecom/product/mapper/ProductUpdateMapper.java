package com.andriambavy.ecom.product.mapper;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.product.db.entity.Product;
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
