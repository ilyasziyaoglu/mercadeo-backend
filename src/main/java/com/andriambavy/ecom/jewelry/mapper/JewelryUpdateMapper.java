package com.andriambavy.ecom.jewelry.mapper;

import com.andriambavy.ecom.client.jewelry.JewelryRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.jewelry.db.entity.Jewelry;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class JewelryUpdateMapper implements BaseUpdateMapper<JewelryRequest, Jewelry> {

	@Override
	public Jewelry toEntityForUpdate(JewelryRequest request, Jewelry entity) {
		return null;
	}
}
