package com.mercadeo.ecom.stock.mapper;

import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.color.mapper.ColorUpdateMapper;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.sizes.mapper.SizeUpdateMapper;
import com.mercadeo.ecom.stock.db.entity.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
@RequiredArgsConstructor
public class StockUpdateMapper implements BaseUpdateMapper<StockRequest, Stock> {

	private final ColorUpdateMapper colorMapper;
	private final SizeUpdateMapper sizeMapper;

	@Override
	public Stock toEntityForUpdate(StockRequest request, Stock entity) {
		if (request.getStock() != null) {
			entity.setStock(request.getStock());
		}
		if (request.getColor() != null) {
			entity.setColor(colorMapper.toEntityForUpdate(request.getColor(), entity.getColor()));
		}
		if (request.getSize() != null) {
			entity.setSize(sizeMapper.toEntityForUpdate(request.getSize(), entity.getSize()));
		}
		return entity;
	}

	public List<Stock> toEntityForUpdate(List<StockRequest> request, List<Stock> entity) {
		List<Stock> entities = new ArrayList<>();
		for (StockRequest stockRequest : request) {
			Stock ent = null;
			for (Stock stock : entity) {
				if (stock.getId().equals(stockRequest.getId())) {
					ent = stock;
					break;
				}
			}
			entities.add(toEntityForUpdate(stockRequest, ent));
		}
		return entities;
	}
}
