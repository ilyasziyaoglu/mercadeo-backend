package com.mercadeo.ecom.client.stock;

import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class StockResponse extends BaseResponse {

	private ColorResponse color;
	private SizeResponse size;
	private Integer stock;
}
