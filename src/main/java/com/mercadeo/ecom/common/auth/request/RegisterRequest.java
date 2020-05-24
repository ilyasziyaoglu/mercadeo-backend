package com.mercadeo.ecom.common.auth.request;

import com.mercadeo.ecom.client.user.Gender;
import lombok.Data;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-25
 */

@Data
public class RegisterRequest {
	private String email;
	private String password;
	private String fullName;
	private Gender gender;
}
