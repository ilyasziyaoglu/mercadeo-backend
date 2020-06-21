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

		if (entity == null) {
			entity = new Brand();
		}

		if (request.getName() != null) {
			entity.setName(request.getName());
		}
		if ( request.getStatus() != null ) {
			entity.setStatus(request.getStatus());
		}
		if (request.getLogoImgUrl() != null ) {
			entity.setLogoImgUrl(request.getLogoImgUrl());
		}

		return entity;
	}
}
