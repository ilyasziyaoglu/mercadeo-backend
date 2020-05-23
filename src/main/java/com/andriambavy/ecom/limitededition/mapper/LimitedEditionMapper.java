package com.andriambavy.ecom.limitededition.mapper;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.client.limitededition.LimitedEditionResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface LimitedEditionMapper extends BaseMapper<LimitedEditionRequest, LimitedEdition, LimitedEditionResponse> {
}
