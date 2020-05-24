package com.mercadeo.ecom.productcolor.mapper;

import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ProductColorMapper extends BaseMapper<ProductColorRequest, ProductColor, ProductColorResponse> {
}
