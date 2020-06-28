package com.mercadeo.ecom.stock.service;

import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.client.stock.StockResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.stock.db.entity.Stock;
import com.mercadeo.ecom.stock.db.repository.StockRepository;
import com.mercadeo.ecom.stock.mapper.StockMapper;
import com.mercadeo.ecom.stock.mapper.StockUpdateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class StockService extends AbstractBaseService<StockRequest, Stock, StockResponse, StockMapper> {
	final private StockRepository repository;
	final private StockMapper mapper;
	final private StockUpdateMapper updateMapper;

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
