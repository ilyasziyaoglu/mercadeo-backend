package com.andriambavy.ecom.client.jewelry;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class JewelryRequest extends BaseRequest {

	private List<String> categories = new ArrayList<>();
	private List<String> colors = new ArrayList<>();
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
}
