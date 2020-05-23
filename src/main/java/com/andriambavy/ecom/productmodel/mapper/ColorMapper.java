package com.andriambavy.ecom.productmodel.mapper;

import com.andriambavy.ecom.client.productmodel.ColorResponse;
import com.andriambavy.ecom.client.productmodel.ProductModelRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.productmodel.db.entity.Color;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ColorMapper extends BaseMapper<ProductModelRequest, Color, ColorResponse> {
}
