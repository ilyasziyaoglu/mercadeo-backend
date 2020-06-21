package com.mercadeo.ecom.common.basemodel.mapper;

import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-05-21
 */

public interface BaseUpdateMapper<Request extends BaseRequest, Entity extends AbstractBaseEntity> {
	Entity toEntityForUpdate(Request request, Entity entity);
}
