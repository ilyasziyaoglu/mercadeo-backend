package com.mercadeo.ecom.order.service;

import com.mercadeo.ecom.client.order.OrderRequest;
import com.mercadeo.ecom.client.order.OrderResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.order.db.entity.Order;
import com.mercadeo.ecom.order.db.repository.OrderRepository;
import com.mercadeo.ecom.order.mapper.OrderMapper;
import com.mercadeo.ecom.order.mapper.OrderUpdateMapper;
import com.mercadeo.ecom.user.db.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class OrderService extends AbstractBaseService<OrderRequest, Order, OrderResponse, OrderMapper> {
	final private OrderRepository repository;
	final private OrderMapper mapper;
	final private OrderUpdateMapper updateMapper;

	@Override
	public OrderRepository getRepository() {
		return repository;
	}

	@Override
	public OrderMapper getMapper() {
		return mapper;
	}

	@Override
	public OrderUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

	@Override
	public ServiceResult<Order> save(String token, OrderRequest request) {
		ServiceResult<Order> serviceResult = new ServiceResult<>();
		Order                entity        = mapper.toEntity(request);

		User user = getUser(token);
		if (user != null) {
			entity.setUser(user);
		} else {
			serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
			serviceResult.setMessage("User not found!");
			return serviceResult;
		}

		Order save = null;
		try {
			save = repository.save(entity);
		} catch (Exception e) {
			serviceResult.setMessage(e.getMessage());
			serviceResult.setHttpStatus(HttpStatus.NOT_MODIFIED);
			e.printStackTrace();
		}

		serviceResult.setValue(save);
		serviceResult.setHttpStatus(HttpStatus.OK);
		return serviceResult;
	}
}
