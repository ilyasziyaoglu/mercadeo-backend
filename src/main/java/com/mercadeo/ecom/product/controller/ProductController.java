package com.mercadeo.ecom.product.controller;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.common.basemodel.request.pager.PageDto;
import com.mercadeo.ecom.common.basemodel.request.pager.PageResource;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.mapper.ProductMapper;
import com.mercadeo.ecom.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

	@PostMapping(GUEST + "/filter")
	public ResponseEntity<PageResource<List<ProductFilterResponse>>> filter(@RequestBody PageDto<ProductFilterRequest> request) {
		ServiceResult<PageResource<List<ProductFilterResponse>>> serviceResult = service.filter(request);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
