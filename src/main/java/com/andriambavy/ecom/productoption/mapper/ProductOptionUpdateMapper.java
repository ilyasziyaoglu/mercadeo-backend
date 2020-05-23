package com.andriambavy.ecom.productoption.mapper;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ProductOptionUpdateMapper implements BaseUpdateMapper<ProductOptionRequest, ProductOption> {

	@Override
	public ProductOption toEntityForUpdate(ProductOptionRequest request, ProductOption entity) {
		return null;
	}
}
