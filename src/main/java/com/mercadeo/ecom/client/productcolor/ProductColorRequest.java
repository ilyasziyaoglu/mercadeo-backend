package com.mercadeo.ecom.client.productcolor;

import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.product.db.entity.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductColorRequest extends BaseRequest {

	private Product product;
	private Color color;
	private String imgUrls;
}
