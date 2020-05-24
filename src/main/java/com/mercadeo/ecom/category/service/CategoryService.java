package com.mercadeo.ecom.category.service;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.category.db.repository.CategoryRepository;
import com.mercadeo.ecom.category.mapper.CategoryMapper;
import com.mercadeo.ecom.category.mapper.CategoryUpdateMapper;
import com.mercadeo.ecom.client.category.CategoryRequest;
import com.mercadeo.ecom.client.category.CategoryResponse;
import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class CategoryService extends AbstractBaseService<CategoryRequest, Category, CategoryResponse, CategoryMapper> {
	private CategoryRepository repository;
	private CategoryMapper mapper;
	private CategoryUpdateMapper updateMapper;

	public CategoryService(CategoryRepository repository, CategoryMapper mapper, CategoryUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public CategoryRepository getRepository() {
		return repository;
	}

	@Override
	public CategoryMapper getMapper() {
		return mapper;
	}

	@Override
	public CategoryUpdateMapper getUpdateMapper() {
		return updateMapper;
	}
}
