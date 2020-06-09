package com.mercadeo.ecom.client.orderproduct;

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
public class OrderProductRequest extends BaseRequest {

	private Long productId;
	private Set<Long> colorIds = new HashSet<>();
	private Set<Long> sizeIds = new HashSet<>();
}
