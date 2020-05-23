package com.andriambavy.ecom.common.basemodel.mapper;

import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.basemodel.request.BaseRequest;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-05-21
 */

public interface BaseUpdateMapper<Request extends BaseRequest, Entity extends AbstractBaseEntity> {
	Entity toEntityForUpdate(Request request, Entity entity);
}
