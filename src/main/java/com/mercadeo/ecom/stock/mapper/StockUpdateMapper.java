package com.mercadeo.ecom.stock.mapper;

import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.stock.db.entity.Stock;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class StockUpdateMapper implements BaseUpdateMapper<StockRequest, Stock> {

	@Override
	public Stock toEntityForUpdate(StockRequest request, Stock entity) {
		return null;
	}
}
