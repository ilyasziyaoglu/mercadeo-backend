package com.andriambavy.ecom.limitededition.controller;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.client.limitededition.LimitedEditionResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.common.basemodel.request.pager.PageDto;
import com.andriambavy.ecom.common.basemodel.request.pager.PageResource;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
import com.andriambavy.ecom.limitededition.mapper.LimitedEditionMapper;
import com.andriambavy.ecom.limitededition.service.LimitedEditionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/limited-edition")
public class LimitedEditionController extends AbstractBaseController<LimitedEditionRequest, LimitedEdition,
		LimitedEditionResponse, LimitedEditionMapper, LimitedEditionService> {
	private LimitedEditionService service;
	private LimitedEditionMapper mapper;

	public LimitedEditionController(final LimitedEditionService service, final LimitedEditionMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public LimitedEditionService getService() {
		return service;
	}

	public LimitedEditionMapper getMapper() {
		return mapper;
	}

	@PostMapping(GUEST + "/filter")
	public ResponseEntity<PageResource<List<LimitedEdition>>> filter(@RequestBody PageDto<LimitedEditionRequest> request) {
		ServiceResult<PageResource<List<LimitedEdition>>> serviceResult = service.filter(request);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
