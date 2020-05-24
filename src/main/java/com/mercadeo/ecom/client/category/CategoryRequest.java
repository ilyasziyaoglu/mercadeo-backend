package com.mercadeo.ecom.client.category;

import com.mercadeo.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryRequest extends BaseRequest {

	private String name;
	private Integer level;
	private String imgUrl;
}
