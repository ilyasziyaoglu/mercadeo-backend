package com.andriambavy.ecom.productmodel.mapper;

import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.productmodel.db.entity.ProductModel;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ProductModelUpdateMapper implements BaseUpdateMapper<ProductModelRequest, ProductModel> {

	@Override
	public ProductModel toEntityForUpdate(ProductModelRequest request, ProductModel entity) {
		return null;
	}
}
