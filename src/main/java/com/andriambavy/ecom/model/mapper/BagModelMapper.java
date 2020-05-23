package com.andriambavy.ecom.model.mapper;

import com.andriambavy.ecom.client.model.ModelRequest;
import com.andriambavy.ecom.client.model.ModelResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.model.db.entity.Model;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface BagModelMapper extends BaseMapper<ModelRequest, Model, ModelResponse> {
}
