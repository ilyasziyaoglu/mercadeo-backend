package com.mercadeo.ecom.product.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.db.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-05-27
 */

@Component
@RequiredArgsConstructor
public class ProductQueryResolver implements GraphQLQueryResolver {

	final ProductRepository repository;

	public List<Product> getProducts(String name) {
		return repository.findAllByName(name);
	}

	public Optional<Product> getById(Long id) {
		return repository.findById(id);
	}
}
