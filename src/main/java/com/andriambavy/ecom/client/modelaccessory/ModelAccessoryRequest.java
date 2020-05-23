package com.andriambavy.ecom.client.modelaccessory;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ModelAccessoryRequest extends BaseRequest {

	private Long modelId;
	private Long accessoryId;
	private String props;
}
