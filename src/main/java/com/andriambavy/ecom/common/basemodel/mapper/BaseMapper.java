package com.andriambavy.ecom.common.basemodel.mapper;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import org.mapstruct.Mapping;

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
