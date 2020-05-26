package com.mercadeo.ecom.productfilter.service;

import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.common.basemodel.request.pager.PageDto;
import com.mercadeo.ecom.common.basemodel.request.pager.PageResource;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.productfilter.db.entity.ProductFilter;
import com.mercadeo.ecom.productfilter.db.query.ProductFilterQuery;
import com.mercadeo.ecom.productfilter.db.repository.ProductFilterRepository;
import com.mercadeo.ecom.productfilter.mapper.ProductFilterMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductFilterService extends AbstractBaseService<ProductFilterRequest, ProductFilter, ProductFilterResponse, ProductFilterMapper> {
	private ProductFilterRepository repository;
	private ProductFilterMapper mapper;

	public ProductFilterService(ProductFilterRepository repository, ProductFilterMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public ProductFilterRepository getRepository() {
		return repository;
	}

	@Override
	public BaseUpdateMapper<ProductFilterRequest, ProductFilter> getUpdateMapper() {
		return null;
	}

	@Override
	public ProductFilterMapper getMapper() {
		return mapper;
	}

	public ServiceResult<PageResource<List<ProductFilterResponse>>> filter(PageDto<ProductFilterRequest> pageDto) {
		ServiceResult<PageResource<List<ProductFilterResponse>>> serviceResult = new ServiceResult<>();
		System.out.println("Filter Product Service staeted");

		Specification<ProductFilter> specifications = ProductFilterQuery.filterProduct(pageDto.getFilterDto());

		ServiceResult<Page<ProductFilter>> pageSR = filter(specifications, pageDto);
		serviceResult.setHttpStatus(pageSR.getHttpStatus());
		if (!pageSR.isSuccess()) {
			serviceResult.setMessage(pageSR.getMessage());
			return serviceResult;
		}

		Page<ProductFilter>         pageEntity = pageSR.getValue();
		List<ProductFilterResponse> pList      = new ArrayList<>();

		if (!CollectionUtils.isEmpty(pageEntity.getContent())) {
			pList = mapper.toResponse(pageEntity.getContent());
		}

		serviceResult.setValue(new PageResource<>(pageDto.getDraw(), pageEntity.getTotalElements(),
				pageEntity.getTotalElements(), pList));

		System.out.println("Offer Product Service finished");
		return serviceResult;
	}
}
