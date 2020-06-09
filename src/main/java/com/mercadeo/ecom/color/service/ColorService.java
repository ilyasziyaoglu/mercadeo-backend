package com.mercadeo.ecom.color.service;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.color.db.repository.ColorRepository;
import com.mercadeo.ecom.color.mapper.ColorMapper;
import com.mercadeo.ecom.color.mapper.ColorUpdateMapper;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import org.springframework.stereotype.Service;

import java.util.Set;


/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ColorService extends AbstractBaseService<ColorRequest, Color, ColorResponse, ColorMapper> {
	private ColorRepository repository;
	private ColorMapper mapper;
	private ColorUpdateMapper updateMapper;

	public ColorService(ColorRepository repository, ColorMapper mapper, ColorUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public ColorRepository getRepository() {
		return repository;
	}

	@Override
	public ColorMapper getMapper() {
		return mapper;
	}

	@Override
	public ColorUpdateMapper getUpdateMapper() {
		return updateMapper;
	}
}
