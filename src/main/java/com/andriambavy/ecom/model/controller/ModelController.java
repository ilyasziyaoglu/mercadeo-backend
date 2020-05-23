package com.andriambavy.ecom.model.controller;

import com.andriambavy.ecom.client.model.ModelRequest;
import com.andriambavy.ecom.client.model.ModelResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.model.db.entity.Model;
import com.andriambavy.ecom.model.mapper.BagModelMapper;
import com.andriambavy.ecom.model.service.ModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/model")
public class ModelController extends AbstractBaseController<ModelRequest, Model, ModelResponse, BagModelMapper, ModelService> {
	private ModelService service;
	private BagModelMapper mapper;

	public ModelController(final ModelService service, final BagModelMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ModelService getService() {
		return service;
	}

	public BagModelMapper getMapper() {
		return mapper;
	}
}
