package com.mercadeo.ecom.client.productfilter;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
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
public class ProductFilterRequest extends BaseRequest {

	private List<BrandRequest> brands;
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
	private Category category1;
	private Category category2;
	private Category category3;
	private String collection;
	private List<ColorRequest> colors;
	private List<SizeRequest> sizes;
	private String tags;
}
