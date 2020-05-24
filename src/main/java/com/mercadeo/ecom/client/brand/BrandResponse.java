package com.mercadeo.ecom.client.brand;

import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class BrandResponse extends BaseResponse {

	private String name;
	private String logoImgUrl;
	private Status status;
}
