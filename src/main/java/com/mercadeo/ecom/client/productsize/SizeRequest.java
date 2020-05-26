package com.mercadeo.ecom.client.productsize;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class SizeRequest extends BaseRequest {

	private String name;
}
