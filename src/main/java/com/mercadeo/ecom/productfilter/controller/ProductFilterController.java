package com.mercadeo.ecom.productfilter.controller;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.common.basemodel.request.pager.PageDto;
import com.mercadeo.ecom.common.basemodel.request.pager.PageResource;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.productfilter.db.entity.ProductFilter;
import com.mercadeo.ecom.productfilter.mapper.ProductFilterMapper;
import com.mercadeo.ecom.productfilter.service.ProductFilterService;
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
@RequestMapping(value = "/product-filter")
public class ProductFilterController extends AbstractBaseController<ProductFilterRequest, ProductFilter, ProductFilterResponse, ProductFilterMapper,
		ProductFilterService> {
	private ProductFilterService service;
	private ProductFilterMapper mapper;

	public ProductFilterController(final ProductFilterService service, final ProductFilterMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ProductFilterService getService() {
		return service;
	}

	public ProductFilterMapper getMapper() {
		return mapper;
	}

	@PostMapping(GUEST + "/filter")
	public ResponseEntity<PageResource<List<ProductFilterResponse>>> filter(@RequestBody PageDto<ProductFilterRequest> request) {
		ServiceResult<PageResource<List<ProductFilterResponse>>> serviceResult = service.filter(request);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
