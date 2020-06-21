package com.mercadeo.ecom.sizes.mapper;

import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.stock.db.entity.Stock;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class SizeUpdateMapper implements BaseUpdateMapper<SizeRequest, Size> {

	@Override
	public Size toEntityForUpdate(SizeRequest request, Size entity) {
		if (entity == null) {
			entity = new Size();
		}

		if (request.getName() != null) {
			entity.setName(request.getName());
		}

		return entity;
	}

	public List<Size> toEntityForUpdate(List<SizeRequest> request, List<Size> entity) {
		List<Size> entities = new ArrayList<>();
		for (SizeRequest sizeRequest : request) {
			Size ent = null;
			for (Size stock : entity) {
				if (stock.getId().equals(sizeRequest.getId())) {
					ent = stock;
					break;
				}
			}
			entities.add(toEntityForUpdate(sizeRequest, ent));
		}
		return entities;
	}
}
