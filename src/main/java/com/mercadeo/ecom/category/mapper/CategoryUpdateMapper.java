package com.mercadeo.ecom.category.mapper;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.category.CategoryRequest;
import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class CategoryUpdateMapper implements BaseUpdateMapper<CategoryRequest, Category> {

	@Override
	public Category toEntityForUpdate(CategoryRequest request, Category entity) {
		return null;
	}
}
