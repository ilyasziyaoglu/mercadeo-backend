package com.andriambavy.ecom.client.user;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class UserRequest extends BaseRequest {

	private String username;
	private String password;
	private String fullName;
	private String imageUrl;
	private String email;
	private String phone;
	private String gender;
	private String country;
	private Date date;
	private String addresses;
	private String roles;
}
