package com.andriambavy.ecom.client.modelaccessory;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ModelAccessoryResponse extends BaseResponse {

	private Long modelId;
	private Long accessoryId;
	private String props;
}
