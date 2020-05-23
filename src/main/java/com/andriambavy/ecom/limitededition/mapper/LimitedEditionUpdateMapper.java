package com.andriambavy.ecom.limitededition.mapper;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class LimitedEditionUpdateMapper implements BaseUpdateMapper<LimitedEditionRequest, LimitedEdition> {

	@Override
	public LimitedEdition toEntityForUpdate(LimitedEditionRequest request, LimitedEdition entity) {
		return null;
	}
}
