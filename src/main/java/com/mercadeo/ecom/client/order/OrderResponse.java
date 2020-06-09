package com.mercadeo.ecom.client.order;

import com.mercadeo.ecom.client.orderproduct.OrderProductResponse;
import com.mercadeo.ecom.client.user.UserResponse;
import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderResponse extends BaseResponse {

	private UserResponse user;
	private String buyerNote;
	private OrderStatus status;
	private String history;
	private Integer order;
	private String shippingInfo;
	private String reason;
	private String receiverName;
	private String receiverPhone;
	private String receiverEmail;
	private String receiverAddress;
	private Set<OrderProductResponse> orderProducts = new HashSet<>();
}
