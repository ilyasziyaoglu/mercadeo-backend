package com.mercadeo.ecom.brand.service;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.brand.db.repository.BrandRepository;
import com.mercadeo.ecom.brand.mapper.BrandMapper;
import com.mercadeo.ecom.brand.mapper.BrandUpdateMapper;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class BrandService extends AbstractBaseService<BrandRequest, Brand, BrandResponse, BrandMapper> {
	final private BrandRepository repository;
	final private BrandMapper mapper;
	final private BrandUpdateMapper updateMapper;

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
