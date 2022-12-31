package com.driver.model.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailsRequestModel {

	private String[] items;
	private float cost;
	private String userId;


}
