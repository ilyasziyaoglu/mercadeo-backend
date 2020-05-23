package com.andriambavy.ecom.jewelry.mapper;

import com.andriambavy.ecom.client.jewelry.JewelryRequest;
import com.andriambavy.ecom.client.jewelry.JewelryResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.jewelry.db.entity.Jewelry;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface JewelryMapper extends BaseMapper<JewelryRequest, Jewelry, JewelryResponse> {
}
