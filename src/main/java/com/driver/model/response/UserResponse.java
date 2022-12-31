package com.driver.model.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {

	private String userId;
	private String email;
	private String firstName;
	private String lastName;



}
