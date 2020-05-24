package com.mercadeo.ecom.category.mapper;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.category.CategoryRequest;
import com.mercadeo.ecom.client.category.CategoryResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<CategoryRequest, Category, CategoryResponse> {
}
