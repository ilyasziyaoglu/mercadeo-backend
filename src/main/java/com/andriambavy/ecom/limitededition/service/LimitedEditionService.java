package com.andriambavy.ecom.limitededition.service;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.client.limitededition.LimitedEditionResponse;
import com.andriambavy.ecom.common.basemodel.request.pager.PageDto;
import com.andriambavy.ecom.common.basemodel.request.pager.PageResource;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
import com.andriambavy.ecom.limitededition.db.query.LimitedEditionQuery;
import com.andriambavy.ecom.limitededition.db.repository.LimitedEditionRepository;
import com.andriambavy.ecom.limitededition.mapper.LimitedEditionMapper;
import com.andriambavy.ecom.limitededition.mapper.LimitedEditionUpdateMapper;
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
public class LimitedEditionService extends AbstractBaseService<LimitedEditionRequest, LimitedEdition, LimitedEditionResponse, LimitedEditionMapper> {
	private LimitedEditionRepository repository;
	private LimitedEditionMapper mapper;
	private LimitedEditionUpdateMapper updateMapper;

	public LimitedEditionService(LimitedEditionRepository repository, LimitedEditionMapper mapper,
								 LimitedEditionUpdateMapper updateMapper) {
		this.repository = repository;
		this.mapper = mapper;
		this.updateMapper = updateMapper;
	}

	@Override
	public LimitedEditionRepository getRepository() {
		return repository;
	}

	@Override
	public LimitedEditionMapper getMapper() {
		return mapper;
	}

	@Override
	public LimitedEditionUpdateMapper getUpdateMapper() {
		return updateMapper;
	}

	public ServiceResult<PageResource<List<LimitedEdition>>> filter(PageDto<LimitedEditionRequest> pageDto) {
		ServiceResult<PageResource<List<LimitedEdition>>> serviceResult = new ServiceResult<>();
		System.out.println("Filter Jewelry Service staeted");

		Specification<LimitedEdition> specifications = LimitedEditionQuery.filterLimitedEdition(pageDto.getFilterDto());

		ServiceResult<Page<LimitedEdition>> pageSR = filter(specifications, pageDto);

		Page<LimitedEdition> pageEntity = pageSR.getValue();
		List<LimitedEdition> pList      = new ArrayList<>();

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
