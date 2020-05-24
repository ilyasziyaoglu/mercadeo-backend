package com.mercadeo.ecom.productcolor.service;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.productcolor.db.repository.ProductColorRepository;
import com.mercadeo.ecom.productcolor.mapper.ProductColorMapper;
import com.mercadeo.ecom.productcolor.mapper.ProductColorUpdateMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductColorService extends AbstractBaseService<ProductColorRequest, ProductColor, ProductColorResponse, ProductColorMapper> {
	private ProductColorRepository repository;
	private ProductColorMapper mapper;
	private ProductColorUpdateMapper updateMapper;

	public ProductColorService(ProductColorRepository repository, ProductColorMapper mapper, ProductColorUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

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
