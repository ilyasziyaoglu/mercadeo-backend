package com.mercadeo.ecom.sizes.controller;

import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.sizes.mapper.SizeMapper;
import com.mercadeo.ecom.sizes.service.SizeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/product-size")
public class ProductSizeController extends AbstractBaseController<SizeRequest, Size,
		SizeResponse, SizeMapper, SizeService> {
	private SizeService service;
	private SizeMapper mapper;

	public ProductSizeController(SizeService service, SizeMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public SizeService getService() {
		return service;
	}

	public SizeMapper getMapper() {
		return mapper;
	}
}
