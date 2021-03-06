package com.mercadeo.ecom.productcolor.mapper;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.color.db.repository.ColorRepository;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
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
public class ProductColorUpdateMapper implements BaseUpdateMapper<ProductColorRequest, ProductColor> {

	final private ColorRepository colorRepository;

	@Override
	public ProductColor toEntityForUpdate(ProductColorRequest request, ProductColor entity) {

		if (entity == null) {
			entity = new ProductColor();
		}

		if (request.getColor() != null) {
			entity.setColor(colorRepository.getOne(request.getColor().getId()));
		}
		if (request.getImgUrl() != null) {
			entity.setImgUrl(request.getImgUrl());
		}
		if (request.getStatus() != null) {
			entity.setStatus(request.getStatus());
		}

		return entity;
	}

	public List<ProductColor> toEntityForUpdate(List<ProductColorRequest> request, List<ProductColor> entity) {
		List<ProductColor> entities = new ArrayList<>();
		for (ProductColorRequest productColorRequest : request) {
			ProductColor ent = null;
			for (ProductColor pc : entity) {
				if (pc.getId().equals(productColorRequest.getId())) {
					ent = pc;
					break;
				}
			}
			entities.add(toEntityForUpdate(productColorRequest, ent));
		}
		return entities;
	}
}
