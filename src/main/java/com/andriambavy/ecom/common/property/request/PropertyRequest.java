package com.andriambavy.ecom.common.property.request;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-25
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PropertyRequest extends BaseRequest {
	private String key;
	private String value;
}
