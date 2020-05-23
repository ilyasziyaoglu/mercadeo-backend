package com.andriambavy.ecom.model.mapper;

import com.andriambavy.ecom.client.model.ModelRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.model.db.entity.Model;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class ModelUpdateMapper implements BaseUpdateMapper<ModelRequest, Model> {

	@Override
	public Model toEntityForUpdate(ModelRequest request, Model entity) {
		return null;
	}
}
