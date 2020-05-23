package com.andriambavy.ecom.client.limitededition;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class LimitedEditionResponse extends BaseResponse {

	private Long productId;
	private String name;
	private String category;
	private BigDecimal price;
	private String videoUrl;
	private String imgUrl;
	private String imgUrls;
	private String colorName;
	private String colorCode;
	private Status status;
}
