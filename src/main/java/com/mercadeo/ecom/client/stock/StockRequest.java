package com.mercadeo.ecom.client.stock;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class StockRequest extends BaseRequest {

	private ColorRequest color;
	private SizeRequest productSize;
	private Integer stock;
}
