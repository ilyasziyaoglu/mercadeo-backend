package com.mercadeo.ecom.client.order;

import com.mercadeo.ecom.client.orderproduct.OrderProductRequest;
import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
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
public class OrderRequest extends BaseRequest {

	private UserRequest user;
	private String buyerNote;
	private OrderStatus status;
	private String shippingInfo;
	private String reason;
	private String receiverName;
	private String receiverPhone;
	private String receiverEmail;
	private String receiverAddress;
	private Set<OrderProductRequest> orderProducts = new HashSet<>();
}
