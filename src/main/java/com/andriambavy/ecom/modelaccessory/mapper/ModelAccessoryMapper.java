package com.andriambavy.ecom.modelaccessory.mapper;

import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryRequest;
import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ModelAccessoryMapper extends BaseMapper<ModelAccessoryRequest, ModelAccessory, ModelAccessoryResponse> {
}
