package com.mercadeo.ecom.sizes.service;

import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.sizes.db.repository.SizeRepository;
import com.mercadeo.ecom.sizes.mapper.SizeMapper;
import com.mercadeo.ecom.sizes.mapper.SizeUpdateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class SizeService extends AbstractBaseService<SizeRequest, Size, SizeResponse, SizeMapper> {
	final private SizeRepository repository;
	final private SizeMapper mapper;
	final private SizeUpdateMapper updateMapper;

	@Override
	public SizeRepository getRepository() {
		return repository;
	}

	@Override
	public SizeMapper getMapper() {
		return mapper;
	}

	@Override
	public SizeUpdateMapper getUpdateMapper() {
		return updateMapper;
	}
}
