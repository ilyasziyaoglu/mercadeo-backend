package com.mercadeo.ecom.productcolor.controller;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.productcolor.mapper.ProductColorMapper;
import com.mercadeo.ecom.productcolor.service.ProductColorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/product-color")
public class ProductColorController extends AbstractBaseController<ProductColorRequest, ProductColor,
		ProductColorResponse, ProductColorMapper, ProductColorService> {
	private ProductColorService service;
	private ProductColorMapper mapper;

	public ProductColorController(ProductColorService service, ProductColorMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ProductColorService getService() {
		return service;
	}

	public ProductColorMapper getMapper() {
		return mapper;
	}
}
