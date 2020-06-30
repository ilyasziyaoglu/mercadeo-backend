package com.mercadeo.ecom.product.service;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.client.productfilter.ProductFilterResponse;
import com.mercadeo.ecom.common.basemodel.request.pager.PageDto;
import com.mercadeo.ecom.common.basemodel.request.pager.PageResource;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.db.query.ProductQuery;
import com.mercadeo.ecom.product.db.repository.ProductRepository;
import com.mercadeo.ecom.product.mapper.ProductMapper;
import com.mercadeo.ecom.product.mapper.ProductUpdateMapper;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class ProductService extends AbstractBaseService<ProductRequest, Product, ProductResponse, ProductMapper> {
	final private ProductRepository repository;
	final private ProductMapper mapper;
	final private ProductUpdateMapper updateMapper;

	@Override
	public ProductRepository getRepository() {
		return repository;
	}

	@Override
	public ProductMapper getMapper() {
		return mapper;
	}

	@Override
	public ProductUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

	public ServiceResult<PageResource<List<ProductFilterResponse>>> filter(String token, PageDto<ProductFilterRequest> pageDto) {
		ServiceResult<PageResource<List<ProductFilterResponse>>> serviceResult = new ServiceResult<>();
		System.out.println("Filter Product Service started");

//		if (!CollectionUtils.isEmpty(pageDto.getFilterDto().getColorIds())) {
//			joinSets(pageDto.getFilterDto().getIds(), repository.findAllProductIdsByColorIn(pageDto.getFilterDto().getColorIds()));
//		}

		if (!CollectionUtils.isEmpty(pageDto.getFilterDto().getSizeIds())) {
			pageDto.getFilterDto().setCheckIds(true);
			pageDto.getFilterDto().setIds(repository.findAllProductIdsBySizeIds(pageDto.getFilterDto().getSizeIds()));
		}

		Specification<Product> specifications = ProductQuery.filterProduct(pageDto.getFilterDto());

		ServiceResult<Page<Product>> pageSR = filter(specifications, pageDto);
		serviceResult.setHttpStatus(pageSR.getHttpStatus());
		if (!pageSR.isSuccess()) {
			serviceResult.setMessage(pageSR.getMessage());
			return serviceResult;
		}

		Page<Product>         pageEntity = pageSR.getValue();
		List<ProductFilterResponse> pList      = new ArrayList<>();

		if (!CollectionUtils.isEmpty(pageEntity.getContent())) {
			pList = mapper.toFilterResponse(pageEntity.getContent());
		}

		serviceResult.setValue(new PageResource<>(pageDto.getDraw(), pageEntity.getTotalElements(),
				pageEntity.getTotalElements(), pList));

		System.out.println("Filter Product Service finished");
		return serviceResult;
	}
}
