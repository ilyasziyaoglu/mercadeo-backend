package com.mercadeo.ecom.client.order;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.user.db.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderRequest extends BaseRequest {

	private User user;
	private String buyerNote;
	private OrderStatus status;
	private String shippingInfo;
	private String reason;
}
