package com.andriambavy.ecom.accessory.mapper;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class AccessoryUpdateMapper implements BaseUpdateMapper<AccessoryRequest, Accessory> {

	@Override
	public Accessory toEntityForUpdate(AccessoryRequest request, Accessory entity) {
		entity.setName(request.getName() != null ? request.getName() : entity.getName());
		entity.setMainCategory(request.getMainCategory() != null ? request.getMainCategory() : entity.getMainCategory());
		entity.setSubCategory(request.getSubCategory() != null ? request.getSubCategory() : entity.getSubCategory());
		entity.setColors(request.getColors() != null ? request.getColors() : entity.getColors());
		entity.setPrice(request.getPrice() != null ? request.getPrice() : entity.getPrice());
		entity.setScale(request.getScale() != null ? request.getScale() : entity.getScale());
		return entity;
	}
}
