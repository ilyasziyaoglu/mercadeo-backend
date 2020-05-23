package com.andriambavy.ecom.product.controller;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.client.product.ProductResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.product.db.entity.Product;
import com.andriambavy.ecom.product.mapper.ProductMapper;
import com.andriambavy.ecom.product.service.ProductService;
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
