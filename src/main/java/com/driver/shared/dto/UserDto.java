package com.driver.shared.dto;


import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto{

	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;



}
