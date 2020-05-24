package com.mercadeo.ecom.common.basemodel.controller;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
@CrossOrigin(origins = "*", allowedHeaders = "*")
public abstract class AbstractBaseController<
        Request extends BaseRequest,
        Entity extends AbstractBaseEntity,
        Response extends BaseResponse,
        Mapper extends BaseMapper<Request, Entity, Response>,
        Service extends AbstractBaseService<Request, Entity, Response, Mapper>> {

    public final String GUEST = "/guest";

    protected abstract Service getService();
    protected abstract Mapper getMapper();

    @GetMapping(GUEST + "/{id}")
    public ResponseEntity<Response> get(@Valid @PathVariable Long id) {
        ServiceResult<Entity> serviceResult = getService().get(id);
        return new ResponseEntity<>(getMapper().toResponse(serviceResult.getValue()), serviceResult.getHttpStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@Valid @PathVariable Long id) {
        ServiceResult<Void> serviceResult = getService().delete(id);
        return new ResponseEntity<>(serviceResult.getHttpStatus());
    }

    @PutMapping
    public ResponseEntity<Response> update(@RequestBody Request request) {
        ServiceResult<Entity> serviceResult = getService().update(request);
        return new ResponseEntity<>(getMapper().toResponse(serviceResult.getValue()), serviceResult.getHttpStatus());
    }

    @PostMapping
    public ResponseEntity<Response> save(@RequestBody Request request) {
        ServiceResult<Entity> serviceResult = getService().save(request);
        return new ResponseEntity<>(getMapper().toResponse(serviceResult.getValue()), serviceResult.getHttpStatus());
    }

    @GetMapping(GUEST + "/all")
    public ResponseEntity<List<Response>> getAll() {
        ServiceResult<List<Entity>> serviceResult = getService().getAll();
        return new ResponseEntity<>(getMapper().toResponse(serviceResult.getValue()), serviceResult.getHttpStatus());
    }
}
