package com.mercadeo.ecom.stock.service;

import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.client.stock.StockResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.stock.db.entity.Stock;
import com.mercadeo.ecom.stock.db.repository.StockRepository;
import com.mercadeo.ecom.stock.mapper.StockMapper;
import com.mercadeo.ecom.stock.mapper.StockUpdateMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class StockService extends AbstractBaseService<StockRequest, Stock, StockResponse, StockMapper> {
	private StockRepository repository;
	private StockMapper mapper;
	private StockUpdateMapper updateMapper;

	public StockService(StockRepository repository, StockMapper mapper, StockUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public StockRepository getRepository() {
		return repository;
	}

	@Override
	public StockMapper getMapper() {
		return mapper;
	}

	@Override
	public StockUpdateMapper getUpdateMapper() {
		return updateMapper;
	}
}
