package com.mercadeo.ecom.client.productcolor;

import com.mercadeo.ecom.client.color.ColorResponse;
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
public class ProductColorResponse extends BaseResponse {

	private ColorResponse color;
	private String imgUrl;
	private Status status;
}
