package com.andriambavy.ecom.accessory.controller;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.accessory.mapper.AccessoryMapper;
import com.andriambavy.ecom.accessory.service.AccessoryService;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.client.accessory.AccessoryResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/accessory")
public class AccessoryController extends AbstractBaseController<AccessoryRequest, Accessory, AccessoryResponse, AccessoryMapper,
		AccessoryService> {
	private AccessoryService service;
	private AccessoryMapper mapper;

	public AccessoryController(final AccessoryService service, final AccessoryMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public AccessoryService getService() {
		return service;
	}

	public AccessoryMapper getMapper() {
		return mapper;
	}

	@GetMapping(GUEST)
	public ResponseEntity<List<Accessory>> getAccessoriesByModelId(@RequestParam(name = "modelId") Long modelId) {
		ServiceResult<List<Accessory>> serviceResult = service.getAccessoriesByModelId(modelId);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
