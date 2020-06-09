package com.mercadeo.ecom.client.orderproduct;

import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderProductResponse extends BaseResponse {

	private ProductResponse product;
	private Set<ColorResponse> colors = new HashSet<>();
	private Set<SizeResponse> sizes = new HashSet<>();
}
