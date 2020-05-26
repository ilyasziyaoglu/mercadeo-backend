package com.mercadeo.ecom.client.category;

import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryResponse extends BaseResponse {

	private String name;
	private Integer level;
	private String imgUrl;
	private Status status = Status.ACTIVE;
	private CategoryResponse parent;
	private Long parentId;
}
