package com.mercadeo.ecom.color.controller;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.color.mapper.ColorMapper;
import com.mercadeo.ecom.color.service.ColorService;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/color")
public class ColorController extends AbstractBaseController<ColorRequest, Color, ColorResponse, ColorMapper, ColorService> {
	private ColorService service;
	private ColorMapper mapper;

	public ColorController(final ColorService service, final ColorMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@Override
	public ColorService getService() {
		return service;
	}

	@Override
	public ColorMapper getMapper() {
		return mapper;
	}
}
