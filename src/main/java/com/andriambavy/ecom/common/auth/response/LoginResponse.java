package com.andriambavy.ecom.common.auth.response;

import com.andriambavy.ecom.client.user.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-24
 */

@Data
@AllArgsConstructor
public class LoginResponse {
	private String token;
	private UserResponse userResponse;
}
