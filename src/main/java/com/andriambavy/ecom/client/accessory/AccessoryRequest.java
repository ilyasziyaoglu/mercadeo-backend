package com.andriambavy.ecom.client.accessory;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class AccessoryRequest extends BaseRequest {

	private String name;
	private BigDecimal price;
	private String mainCategory;
	private String subCategory;
	private String colors;
	private Double scale;
}
