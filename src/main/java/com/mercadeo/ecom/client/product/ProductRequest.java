package com.mercadeo.ecom.client.product;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.enums.Status;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductRequest extends BaseRequest {

	private String code;
	private String name;
	private BrandRequest brand;
	private String imgUrl;
	private BigDecimal price;
	private Category category1;
	private Category category2;
	private Category category3;
	private String collection;
	private Status status;
	private List<ProductColor> productColors;
	private List<SizeRequest> sizes;
	private List<StockRequest> stocks;
	private String infos;
	private String tags;
}