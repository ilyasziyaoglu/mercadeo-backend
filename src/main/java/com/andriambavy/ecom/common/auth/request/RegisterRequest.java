package com.andriambavy.ecom.common.auth.request;

import lombok.AllArgsConstructor;
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
	private String gender;
}
