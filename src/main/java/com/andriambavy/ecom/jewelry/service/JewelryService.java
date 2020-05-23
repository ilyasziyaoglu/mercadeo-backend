package com.andriambavy.ecom.jewelry.service;

import com.andriambavy.ecom.client.jewelry.JewelryRequest;
import com.andriambavy.ecom.client.jewelry.JewelryResponse;
import com.andriambavy.ecom.common.basemodel.request.pager.PageDto;
import com.andriambavy.ecom.common.basemodel.request.pager.PageResource;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.jewelry.db.entity.Jewelry;
import com.andriambavy.ecom.jewelry.db.query.JewelryQuery;
import com.andriambavy.ecom.jewelry.db.repository.JewelryRepository;
import com.andriambavy.ecom.jewelry.mapper.JewelryMapper;
import com.andriambavy.ecom.jewelry.mapper.JewelryUpdateMapper;
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
public class JewelryService extends AbstractBaseService<JewelryRequest, Jewelry, JewelryResponse, JewelryMapper> {
	private JewelryRepository repository;
	private JewelryMapper mapper;
	private JewelryUpdateMapper updateMapper;

	public JewelryService(JewelryRepository repository, JewelryMapper mapper, JewelryUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public JewelryRepository getRepository() {
		return repository;
	}

	@Override
	public JewelryMapper getMapper() {
		return mapper;
	}

	@Override
	public JewelryUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

	public ServiceResult<PageResource<List<Jewelry>>> filter(PageDto<JewelryRequest> pageDto) {
		ServiceResult<PageResource<List<Jewelry>>> serviceResult = new ServiceResult<>();
		System.out.println("Filter Jewelry Service staeted");

		Specification<Jewelry> specifications = JewelryQuery.filterJewelry(pageDto.getFilterDto());

		ServiceResult<Page<Jewelry>> pageSR = filter(specifications, pageDto);

		Page<Jewelry> pageEntity = pageSR.getValue();
		List<Jewelry> pList      = new ArrayList<>();

		if (!CollectionUtils.isEmpty(pageEntity.getContent())) {
			pList = pageEntity.getContent();
		}

		System.out.println("Jewelry Filter Service finished");
		serviceResult.setValue(
				new PageResource<>(pageDto.getDraw(),
				pageEntity.getTotalElements(),
				pageEntity.getTotalElements(),
				pList)
		);

		return serviceResult;
	}

}
