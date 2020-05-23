package com.andriambavy.ecom.client.product;

import com.andriambavy.ecom.client.productmodel.ProductModelResponse;
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
public class ProductResponse extends BaseResponse {

	private String code;
	private String name;
	private String infos;
	private String collection;
	private String category;
	private String tags;
	private Status status;
	private List<ProductModelResponse> productModels = new ArrayList<>();
}
