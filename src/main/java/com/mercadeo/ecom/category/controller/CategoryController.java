package com.mercadeo.ecom.category.controller;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.category.mapper.CategoryMapper;
import com.mercadeo.ecom.category.service.CategoryService;
import com.mercadeo.ecom.client.category.CategoryRequest;
import com.mercadeo.ecom.client.category.CategoryResponse;
import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/category")
public class CategoryController extends AbstractBaseController<CategoryRequest, Category, CategoryResponse, CategoryMapper, CategoryService> {
	private CategoryService service;
	private CategoryMapper mapper;

	public CategoryController(final CategoryService service, final CategoryMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public CategoryService getService() {
		return service;
	}

	public CategoryMapper getMapper() {
		return mapper;
	}
}
