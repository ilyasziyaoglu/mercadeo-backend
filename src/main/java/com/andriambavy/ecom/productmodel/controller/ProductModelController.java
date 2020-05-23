package com.andriambavy.ecom.productmodel.controller;

import com.andriambavy.ecom.client.productmodel.ColorResponse;
import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.client.productmodel.ProductModelResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.productmodel.db.entity.ProductModel;
import com.andriambavy.ecom.productmodel.mapper.ProductModelMapper;
import com.andriambavy.ecom.productmodel.service.ProductModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/product-model")
public class ProductModelController extends AbstractBaseController<ProductModelRequest, ProductModel,
		ProductModelResponse, ProductModelMapper, ProductModelService> {
	private ProductModelService service;
	private ProductModelMapper mapper;

	public ProductModelController(final ProductModelService service, final ProductModelMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ProductModelService getService() {
		return service;
	}

	public ProductModelMapper getMapper() {
		return mapper;
	}

	@GetMapping(GUEST + "/color-list")
	public ResponseEntity<List<ColorResponse>> getUniqueColors() {
		ServiceResult<List<ColorResponse>> serviceResult = service.getUniqueColors();
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
