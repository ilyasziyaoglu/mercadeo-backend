package com.mercadeo.ecom.client.productcolor;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductColorRequest extends BaseRequest {

	private ColorRequest color;
	private String imgUrl;
	private Status status;
}
