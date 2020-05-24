package com.mercadeo.ecom.stock.controller;

import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.client.stock.StockResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.stock.db.entity.Stock;
import com.mercadeo.ecom.stock.mapper.StockMapper;
import com.mercadeo.ecom.stock.service.StockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/stock")
public class StockController extends AbstractBaseController<StockRequest, Stock,
		StockResponse, StockMapper, StockService> {
	private StockService service;
	private StockMapper mapper;

	public StockController(StockService service, StockMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public StockService getService() {
		return service;
	}

	public StockMapper getMapper() {
		return mapper;
	}
}
