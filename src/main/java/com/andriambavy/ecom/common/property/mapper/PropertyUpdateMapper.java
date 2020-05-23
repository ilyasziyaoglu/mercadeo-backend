package com.andriambavy.ecom.common.property.mapper;

import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.common.property.db.entity.Property;
import com.andriambavy.ecom.common.property.request.PropertyRequest;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class PropertyUpdateMapper implements BaseUpdateMapper<PropertyRequest, Property> {

	@Override
	public Property toEntityForUpdate(PropertyRequest request, Property entity) {
		return null;
	}
}
