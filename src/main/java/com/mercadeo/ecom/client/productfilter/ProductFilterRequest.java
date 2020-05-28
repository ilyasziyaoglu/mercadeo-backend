package com.mercadeo.ecom.client.productfilter;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductFilterRequest extends BaseRequest {

	private Set<Long> brandIds = new HashSet<>();
	private Set<Long> ids = new HashSet<>();
	private boolean checkIds = false;
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
	private Long category1;
	private Long category2;
	private Long category3;
	private String collection;
	private Set<Long> colorIds = new HashSet<>();
	private Set<Long> sizeIds = new HashSet<>();
	private String tags;
}
