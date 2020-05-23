package com.andriambavy.ecom.client.order;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
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
public class OrderRequest extends BaseRequest {

	private User user;
	private List<ProductOptionRequest> productOptions = new ArrayList<>();
	private String buyerNote;
	private OrderStatus status;
	private String shippingInfo;
	private String reason;
}
