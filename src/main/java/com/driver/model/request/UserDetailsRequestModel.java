package com.driver.model.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDetailsRequestModel {

	private String firstName;
	private String lastName;
	private String email;


}
