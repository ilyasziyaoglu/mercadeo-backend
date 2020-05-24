package com.mercadeo.ecom.common.basemodel.service;

import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.basemodel.request.pager.DtColumnDto;
import com.mercadeo.ecom.common.basemodel.request.pager.DtOrderDto;
import com.mercadeo.ecom.common.basemodel.request.pager.PageDto;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

public abstract class AbstractBaseService<
		Request extends BaseRequest,
		Entity extends AbstractBaseEntity,
		Response extends BaseResponse,
		Mapper extends BaseMapper<Request, Entity, Response>> extends BaseService<Request, Entity, BaseRepository<Entity>, BaseUpdateMapper<Request, Entity>> {

	public abstract Mapper getMapper();

	public ServiceResult<Entity> get(Long id) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		Optional<Entity>      entity        = getRepository().findById(id);
		if (entity.isPresent()) {
			serviceResult.setValue(entity.get());
			serviceResult.setHttpStatus(HttpStatus.OK);
		} else {
			serviceResult.setMessage("Entity can not found by the given id: " + id);
			serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
		}
		return serviceResult;
	}

	public ServiceResult<Void> delete(Long id) {
		ServiceResult<Void> serviceResult = new ServiceResult<>();
		try {
			getRepository().deleteById(id);
			serviceResult.setHttpStatus(HttpStatus.OK);
		} catch (Exception e) {
			serviceResult.setMessage("Entity can not delete by the given id: " + id + ". Error message: " + e.getMessage());
			serviceResult.setHttpStatus(HttpStatus.NOT_MODIFIED);
		}
		return serviceResult;
	}

	public ServiceResult<Entity> update(@NotNull Request request) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		Optional<Entity>      entity        = getRepository().findById(request.getId());
		if (entity.isPresent()) {
			try {
				Entity newEntity = getUpdateMapper().toEntityForUpdate(request, entity.get());
				getRepository().save(newEntity);
				serviceResult.setValue(newEntity);
				serviceResult.setHttpStatus(HttpStatus.OK);
			} catch (Exception e) {
				serviceResult.setMessage("Entity can not update with the given id: " + request.getId() + ". Error message: " + e.getMessage());
				serviceResult.setHttpStatus(HttpStatus.NOT_MODIFIED);
			}
		} else {
			serviceResult.setMessage("Entity not found to update update with the given id: " + request.getId());
			serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
		}
		return serviceResult;
	}

	public ServiceResult<Entity> save(Request request) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		try {
			Entity entity = getRepository().save(getMapper().toEntity(request));
			serviceResult.setValue(entity);
			serviceResult.setHttpStatus(HttpStatus.CREATED);
		} catch (Exception e) {
			serviceResult.setMessage("Entity can not save. Error message: " + e.getMessage());
			serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return serviceResult;
	}

	public ServiceResult<List<Entity>> getAll() {
		ServiceResult<List<Entity>> serviceResult = new ServiceResult<>();
		try {
			Optional<List<Entity>> entityList = Optional.of(getRepository().findAll());
			serviceResult.setValue(entityList.get());
			serviceResult.setHttpStatus(HttpStatus.OK);
		} catch (Exception e) {
			serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			serviceResult.setMessage(e.getMessage());
		}
		return serviceResult;
	}

	protected <T> ServiceResult<Page<Entity>> filter(Specification<Entity> specifications, PageDto<T> page) {

		ServiceResult<Page<Entity>> serviceResult = new ServiceResult<>();

		try {
			PageRequest pageRequest = PageRequest.of(page.getPage(), page.getSize(), Sort.Direction.DESC, "id");
			if (!CollectionUtils.isEmpty(page.getOrder()) && !CollectionUtils.isEmpty(page.getColumns())) {
				Optional<DtOrderDto> dtOrderOptional = page.getOrder()
						.stream()
						.findFirst();
				if (dtOrderOptional.isPresent()) {
					DtOrderDto dtOrderDto = dtOrderOptional.get();
					DtColumnDto sortedColumn = page.getColumns()
							.stream()
							.filter((c) -> c.getName()
									.equals(dtOrderDto.getColumn()
											.toString()))
							.findFirst()
							.orElse(null);
					if (sortedColumn != null && sortedColumn.getOrderable()) {
						Sort.Order order = (new Sort.Order(Sort.Direction.fromString(dtOrderDto.getDir()), sortedColumn.getData())).ignoreCase();
						pageRequest = PageRequest.of(page.getPage(), page.getSize(), Sort.by(order));
					}
				}
			}

			Page<Entity> pageEntity = getRepository().findAll(specifications, pageRequest);
			serviceResult.setValue(pageEntity);
		} catch (Exception var9) {
			serviceResult.setHttpStatus(HttpStatus.BAD_REQUEST);
			serviceResult.setMessage(var9.getMessage());
			System.out.println("filter got exception. Message = " + var9.getMessage());
			var9.printStackTrace();
//			logger.error("filter got exception. Message = " + var9.getMessage(), var9);
		}

		return serviceResult;
	}
}
