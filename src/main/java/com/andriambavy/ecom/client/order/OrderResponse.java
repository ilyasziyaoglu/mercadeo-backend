package com.andriambavy.ecom.client.order;

import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.user.db.entity.User;
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
public class OrderResponse extends BaseResponse {

	private User user;
	private List<ProductOptionResponse> productOptions = new ArrayList<>();
	private String buyerNote;
	private OrderStatus status;
	private String history;
	private String shippingInfo;
	private String response;
}
