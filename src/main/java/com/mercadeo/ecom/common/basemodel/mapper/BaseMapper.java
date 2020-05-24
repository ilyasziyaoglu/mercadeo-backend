package com.mercadeo.ecom.common.basemodel.mapper;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

public interface BaseMapper<Request extends BaseRequest, Entity extends AbstractBaseEntity, Response extends BaseResponse> {
    Entity toEntity(Request request);
    Response toResponse(Entity entity);
    List<Entity> toEntity(List<Request> requestList);
    List<Response> toResponse(List<Entity> requestList);
}
