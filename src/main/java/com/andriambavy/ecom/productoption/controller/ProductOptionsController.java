package com.andriambavy.ecom.productoption.controller;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
import com.andriambavy.ecom.productoption.mapper.ProductOptionMapper;
import com.andriambavy.ecom.productoption.service.ProductOptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/product-option")
public class ProductOptionsController extends AbstractBaseController<ProductOptionRequest, ProductOption, ProductOptionResponse, ProductOptionMapper, ProductOptionService> {
	private ProductOptionService service;
	private ProductOptionMapper mapper;

	public ProductOptionsController(final ProductOptionService service, final ProductOptionMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ProductOptionService getService() {
		return service;
	}

	public ProductOptionMapper getMapper() {
		return mapper;
	}
}
