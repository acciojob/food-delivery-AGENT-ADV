package com.driver.model.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodDetailsResponse {

	private String foodId;
	private String foodName;
	private float foodPrice;
	private String foodCategory;



}
