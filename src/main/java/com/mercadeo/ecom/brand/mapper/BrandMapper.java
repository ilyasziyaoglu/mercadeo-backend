package com.mercadeo.ecom.brand.mapper;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface BrandMapper extends BaseMapper<BrandRequest, Brand, BrandResponse> {
}
