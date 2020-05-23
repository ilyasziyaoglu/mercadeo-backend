package com.andriambavy.ecom.modelaccessory.controller;

import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryRequest;
import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import com.andriambavy.ecom.modelaccessory.mapper.ModelAccessoryMapper;
import com.andriambavy.ecom.modelaccessory.service.ModelAccessoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/model-accessory")
public class ModelAccessoryController extends AbstractBaseController<ModelAccessoryRequest, ModelAccessory, ModelAccessoryResponse,	ModelAccessoryMapper, ModelAccessoryService> {
	private ModelAccessoryService service;
	private ModelAccessoryMapper mapper;

	public ModelAccessoryController(final ModelAccessoryService service, final ModelAccessoryMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public ModelAccessoryService getService() {
		return service;
	}

	public ModelAccessoryMapper getMapper() {
		return mapper;
	}

	@GetMapping(GUEST)
	public ResponseEntity<ModelAccessory> getPropertiesByModelIdAndAccessoryId(@RequestParam(name = "modelId") Long modelId,
																   @RequestParam(name = "accessoryId") Long accessoryId) {
		ServiceResult<ModelAccessory> serviceResult = service.getPropertiesByModelIdAndAccessoryId(modelId, accessoryId);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
