package com.mercadeo.ecom.client.product;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.client.stock.StockResponse;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.enums.Status;
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
public class ProductResponse extends BaseResponse {

	private String code;
	private String name;
	private BrandResponse brand;
	private String imgUrl;
	private BigDecimal price;
	private Category category1;
	private Category category2;
	private Category category3;
	private String collection;
	private Status status;
	private List<ProductColorResponse> productColors;
	private List<SizeResponse> sizes;
	private List<StockResponse> stocks;
	private Boolean isColorsOptional;
	private Boolean isSizesOptional;
	private String description;
	private String features;
	private String tags;
}
