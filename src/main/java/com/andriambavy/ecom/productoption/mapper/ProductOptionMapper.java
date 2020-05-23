package com.andriambavy.ecom.productoption.mapper;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface ProductOptionMapper extends BaseMapper<ProductOptionRequest, ProductOption, ProductOptionResponse> {
}
