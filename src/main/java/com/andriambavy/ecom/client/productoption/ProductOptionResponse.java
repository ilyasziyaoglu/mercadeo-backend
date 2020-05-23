package com.andriambavy.ecom.client.productoption;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductOptionResponse extends BaseResponse {

	private BigDecimal price;
	private Integer stock;
	private ProductSize productSize;
	private String sizeMeasures;
}
