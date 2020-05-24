package com.mercadeo.ecom.client.user;

import com.mercadeo.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class UserResponse extends BaseResponse {

	private String username;
	private String fullName;
	private String imageUrl;
	private String email;
	private String phone;
	private String addresses;
	private String roles;
	private Gender gender;
	private String country;
	private Date date;
}
