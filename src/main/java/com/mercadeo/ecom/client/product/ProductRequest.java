package com.mercadeo.ecom.client.product;

import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.category.CategoryRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

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
	private MultipartFile img;
	private BigDecimal price;
	private CategoryRequest category1;
	private CategoryRequest category2;
	private CategoryRequest category3;
	private String collection;
	private Status status;
	private List<ProductColorRequest> productColors;
	private List<SizeRequest> sizes;
	private List<StockRequest> stocks;
	private Boolean isColorsOptional;
	private Boolean isSizesOptional;
	private String description;
	private String features;
	private String tags;
}
