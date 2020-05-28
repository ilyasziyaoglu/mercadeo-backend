package com.mercadeo.ecom.product.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.db.repository.ProductRepository;
import com.mercadeo.ecom.product.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-05-27
 */

@Component
@RequiredArgsConstructor
public class ProductMutationResolver implements GraphQLMutationResolver {

	final ProductRepository repository;
	final ProductMapper mapper;

	public Product createProduct(ProductRequest request) {
		return repository.save(mapper.toEntity(request));
	}
}
