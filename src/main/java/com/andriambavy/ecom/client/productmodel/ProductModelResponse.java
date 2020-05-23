package com.andriambavy.ecom.client.productmodel;

import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductModelResponse extends BaseResponse {

	private String videoUrl;
	private String imgUrl;
	private String imgUrls;
	private String colorName;
	private String colorCode;
	private Status status;
	private List<ProductOptionResponse> productOptions = new ArrayList<>();
}
