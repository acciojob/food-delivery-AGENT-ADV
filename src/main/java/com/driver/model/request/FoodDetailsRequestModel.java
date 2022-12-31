package com.driver.model.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodDetailsRequestModel {

	private String foodName;
	private String foodCategory;
	private float foodPrice;


}
