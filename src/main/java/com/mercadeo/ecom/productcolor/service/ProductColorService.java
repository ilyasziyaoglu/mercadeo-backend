package com.mercadeo.ecom.productcolor.service;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.productcolor.db.repository.ProductColorRepository;
import com.mercadeo.ecom.productcolor.mapper.ProductColorMapper;
import com.mercadeo.ecom.productcolor.mapper.ProductColorUpdateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class ProductColorService extends AbstractBaseService<ProductColorRequest, ProductColor, ProductColorResponse, ProductColorMapper> {
	final private ProductColorRepository repository;
	final private ProductColorMapper mapper;
	final private ProductColorUpdateMapper updateMapper;

	@Override
	public ProductColorRepository getRepository() {
		return repository;
	}

	@Override
	public ProductColorMapper getMapper() {
		return mapper;
	}

	@Override
	public ProductColorUpdateMapper getUpdateMapper() {
		return updateMapper;
	}
}
