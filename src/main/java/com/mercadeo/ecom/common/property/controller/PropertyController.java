package com.mercadeo.ecom.common.property.controller;

import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.common.property.db.entity.Property;
import com.mercadeo.ecom.common.property.mapper.PropetyMapper;
import com.mercadeo.ecom.common.property.service.PropertyService;
import com.mercadeo.ecom.common.property.request.PropertyRequest;
import com.mercadeo.ecom.common.property.response.PropertyResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/property")
public class PropertyController extends AbstractBaseController<PropertyRequest, Property, PropertyResponse, PropetyMapper,
		PropertyService> {
	private PropertyService service;
	private PropetyMapper mapper;

	public PropertyController(final PropertyService service, final PropetyMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public PropertyService getService() {
		return service;
	}

	public PropetyMapper getMapper() {
		return mapper;
	}
}
