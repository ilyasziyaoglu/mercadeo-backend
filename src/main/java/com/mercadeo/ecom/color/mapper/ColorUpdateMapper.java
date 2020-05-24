package com.mercadeo.ecom.color.mapper;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ColorUpdateMapper implements BaseUpdateMapper<ColorRequest, Color> {

	@Override
	public Color toEntityForUpdate(ColorRequest request, Color entity) {
		return null;
	}
}
