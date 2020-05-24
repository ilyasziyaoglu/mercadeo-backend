package com.mercadeo.ecom.color.mapper;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ColorMapper extends BaseMapper<ColorRequest, Color, ColorResponse> {
}
