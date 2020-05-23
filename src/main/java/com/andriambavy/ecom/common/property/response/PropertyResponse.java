package com.andriambavy.ecom.common.property.response;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-25
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class PropertyResponse extends BaseResponse {
	private String key;
	private String value;
}
