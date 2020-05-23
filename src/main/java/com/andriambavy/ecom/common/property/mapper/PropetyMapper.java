package com.andriambavy.ecom.common.property.mapper;

import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.common.property.db.entity.Property;
import com.andriambavy.ecom.common.property.request.PropertyRequest;
import com.andriambavy.ecom.common.property.response.PropertyResponse;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface PropetyMapper extends BaseMapper<PropertyRequest, Property, PropertyResponse> {
}
