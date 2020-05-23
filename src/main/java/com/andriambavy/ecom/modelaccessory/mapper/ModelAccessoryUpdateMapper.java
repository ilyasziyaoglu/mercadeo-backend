package com.andriambavy.ecom.modelaccessory.mapper;

import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ModelAccessoryUpdateMapper implements BaseUpdateMapper<ModelAccessoryRequest, ModelAccessory> {

	@Override
	public ModelAccessory toEntityForUpdate(ModelAccessoryRequest request, ModelAccessory entity) {
		entity.setAccessoryId(request.getAccessoryId() != null ? request.getAccessoryId() : entity.getAccessoryId());
		entity.setModelId(request.getModelId() != null ? request.getModelId() : entity.getModelId());
		entity.setProps(request.getProps() != null ? request.getProps() : entity.getProps());
		return entity;
	}
}
