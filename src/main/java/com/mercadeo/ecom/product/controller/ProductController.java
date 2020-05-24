package com.mercadeo.ecom.product.controller;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.mapper.ProductMapper;
import com.mercadeo.ecom.product.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/product")
public class ProductController extends AbstractBaseController<ProductRequest, Product, ProductResponse, ProductMapper,
		ProductService> {
	private ProductService service;
	private ProductMapper mapper;

	public ProductController(final ProductService service, final ProductMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ProductService getService() {
		return service;
	}

	public ProductMapper getMapper() {
		return mapper;
	}
}
