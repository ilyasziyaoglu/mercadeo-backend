package com.mercadeo.ecom.brand.service;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.brand.db.repository.BrandRepository;
import com.mercadeo.ecom.brand.mapper.BrandMapper;
import com.mercadeo.ecom.brand.mapper.BrandUpdateMapper;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class BrandService extends AbstractBaseService<BrandRequest, Brand, BrandResponse, BrandMapper> {
	private BrandRepository repository;
	private BrandMapper mapper;
	private BrandUpdateMapper updateMapper;

	public BrandService(BrandRepository repository, BrandMapper mapper, BrandUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public BrandRepository getRepository() {
		return repository;
	}

	@Override
	public BrandMapper getMapper() {
		return mapper;
	}

	@Override
	public BrandUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

}
