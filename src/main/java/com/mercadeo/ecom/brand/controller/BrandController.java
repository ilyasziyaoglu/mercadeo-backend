package com.mercadeo.ecom.brand.controller;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.brand.mapper.BrandMapper;
import com.mercadeo.ecom.brand.service.BrandService;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/brand")
public class BrandController extends AbstractBaseController<BrandRequest, Brand,
		BrandResponse, BrandMapper, BrandService> {
	private BrandService service;
	private BrandMapper mapper;

	public BrandController(final BrandService service, final BrandMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public BrandService getService() {
		return service;
	}

	public BrandMapper getMapper() {
		return mapper;
	}
}
