package com.mercadeo.ecom.productcolor.mapper;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ProductColorUpdateMapper implements BaseUpdateMapper<ProductColorRequest, ProductColor> {

	@Override
	public ProductColor toEntityForUpdate(ProductColorRequest request, ProductColor entity) {
		return null;
	}
}
