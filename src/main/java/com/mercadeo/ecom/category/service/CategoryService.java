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
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
@RequiredArgsConstructor
public class CategoryService extends AbstractBaseService<CategoryRequest, Category, CategoryResponse, CategoryMapper> {
	final private CategoryRepository repository;
	final private CategoryMapper mapper;
	final private CategoryUpdateMapper updateMapper;

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

	public ServiceResult<List<CategoryResponse>> getTree() {
		ServiceResult<List<CategoryResponse>> serviceResult     = new ServiceResult<>();
		List<Category>                        categories        = getAll(null).getValue();
		List<CategoryResponse>                categoryResponses = categories.stream()
				.map(mapper::toResponse)
				.collect(Collectors.toList());

		List<CategoryResponse> tree = categoryResponses.stream()
				.filter(categoryResponse -> categoryResponse.getLevel() == 1)
				.collect(Collectors.toList());

		tree.forEach(flevel -> {
			flevel.setChildren(categoryResponses.stream().filter(categoryResponse ->
							categoryResponse.getLevel() == 2 && categoryResponse.getParent() != null &&
							categoryResponse.getParent().getId().equals(flevel.getId())).collect(Collectors.toList()));

			flevel.getChildren().forEach(slevel -> {
				slevel.setChildren(categoryResponses.stream().filter(categoryResponse ->
						categoryResponse.getLevel() == 3 && categoryResponse.getParent() != null &&
								categoryResponse.getParent().getId().equals(slevel.getId())).collect(Collectors.toList()));
			});
		});

		serviceResult.setValue(tree);
		serviceResult.setHttpStatus(HttpStatus.OK);

		return serviceResult;
	}
}
