package com.mercadeo.ecom.client.category;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryRequest extends BaseRequest {

	private String name;
	private Integer level;
	private Integer order;
	private String imgUrl;
	private Status status = Status.ACTIVE;
	private CategoryRequest parent1;
	private CategoryRequest parent2;
}
