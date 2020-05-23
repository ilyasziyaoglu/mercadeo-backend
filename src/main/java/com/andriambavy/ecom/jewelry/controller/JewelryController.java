package com.andriambavy.ecom.jewelry.controller;

import com.andriambavy.ecom.client.jewelry.JewelryRequest;
import com.andriambavy.ecom.client.jewelry.JewelryResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.common.basemodel.request.pager.PageDto;
import com.andriambavy.ecom.common.basemodel.request.pager.PageResource;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.jewelry.db.entity.Jewelry;
import com.andriambavy.ecom.jewelry.mapper.JewelryMapper;
import com.andriambavy.ecom.jewelry.service.JewelryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/jewelry")
public class JewelryController extends AbstractBaseController<JewelryRequest, Jewelry,
		JewelryResponse, JewelryMapper, JewelryService> {
	private JewelryService service;
	private JewelryMapper mapper;

	public JewelryController(final JewelryService service, final JewelryMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public JewelryService getService() {
		return service;
	}

	public JewelryMapper getMapper() {
		return mapper;
	}

	@PostMapping(GUEST + "/filter")
	public ResponseEntity<PageResource<List<Jewelry>>> filter(@RequestBody PageDto<JewelryRequest> request) {
		ServiceResult<PageResource<List<Jewelry>>> serviceResult = service.filter(request);
		return new ResponseEntity<>(serviceResult.getValue(), serviceResult.getHttpStatus());
	}
}
