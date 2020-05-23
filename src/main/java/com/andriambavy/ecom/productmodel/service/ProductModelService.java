package com.andriambavy.ecom.productmodel.service;

import com.andriambavy.ecom.client.productmodel.ColorResponse;
import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.client.productmodel.ProductModelResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.productmodel.db.entity.Color;
import com.andriambavy.ecom.productmodel.db.entity.ProductModel;
import com.andriambavy.ecom.productmodel.db.repository.ColorRepository;
import com.andriambavy.ecom.productmodel.db.repository.ProductModelRepository;
import com.andriambavy.ecom.productmodel.mapper.ColorMapper;
import com.andriambavy.ecom.productmodel.mapper.ProductModelMapper;
import com.andriambavy.ecom.productmodel.mapper.ProductModelUpdateMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductModelService extends AbstractBaseService<ProductModelRequest, ProductModel, ProductModelResponse, ProductModelMapper> {
	private ProductModelRepository repository;
	private ProductModelMapper mapper;
	private ColorRepository colorRepository;
	private ColorMapper colorMapper;
	private ProductModelUpdateMapper updateMapper;

	public ProductModelService(ProductModelRepository repository, ProductModelMapper mapper, ColorRepository colorRepository,
							   ColorMapper colorMapper, ProductModelUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.colorRepository = colorRepository;
		this.colorMapper = colorMapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public ProductModelRepository getRepository() {
		return repository;
	}

	@Override
	public ProductModelMapper getMapper() {
		return mapper;
	}

	@Override
	public ProductModelUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

	public ServiceResult<List<ColorResponse>> getUniqueColors() {
		ServiceResult<List<ColorResponse>> serviceResult = new ServiceResult<>();

		List<Color> colorList = colorRepository.findAll();
		serviceResult.setHttpStatus(HttpStatus.OK);
		serviceResult.setValue(colorMapper.toResponse(colorList));
		return serviceResult;
	}

}
