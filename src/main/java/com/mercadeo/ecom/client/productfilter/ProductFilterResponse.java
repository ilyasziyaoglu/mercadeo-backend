package com.mercadeo.ecom.client.productfilter;

import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductFilterResponse extends BaseResponse {

	private String name;
	private String imgUrl;
	private BigDecimal price;
	private String collection;
	private String features;
	private String tags;
}
