package com.mercadeo.ecom.productfilter.mapper;

import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.productfilter.db.entity.ProductFilter;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ProductFilterMapper extends BaseMapper<ProductFilterRequest, ProductFilter, ProductFilterResponse> {
}
