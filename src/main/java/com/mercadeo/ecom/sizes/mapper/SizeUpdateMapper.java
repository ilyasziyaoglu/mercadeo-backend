package com.mercadeo.ecom.sizes.mapper;

import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.sizes.db.entity.Size;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class SizeUpdateMapper implements BaseUpdateMapper<SizeRequest, Size> {

	@Override
	public Size toEntityForUpdate(SizeRequest request, Size entity) {
		return null;
	}
}
