package com.mercadeo.ecom.sizes.mapper;

import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.sizes.db.entity.Size;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface SizeMapper extends BaseMapper<SizeRequest, Size, SizeResponse> {
}
