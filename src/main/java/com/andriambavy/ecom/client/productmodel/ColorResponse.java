package com.andriambavy.ecom.client.productmodel;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ColorResponse extends BaseResponse {

	private String colorName;
	private String colorCode;
}
