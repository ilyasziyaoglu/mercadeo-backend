package com.mercadeo.ecom.client.productcolor;

import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.product.db.entity.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductColorResponse extends BaseResponse {

	private Product product;
	private Color color;
	private String imgUrls;
}
