package com.mercadeo.ecom.brand.mapper;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class BrandUpdateMapper implements BaseUpdateMapper<BrandRequest, Brand> {

	@Override
	public Brand toEntityForUpdate(BrandRequest request, Brand entity) {
		return null;
	}
}
