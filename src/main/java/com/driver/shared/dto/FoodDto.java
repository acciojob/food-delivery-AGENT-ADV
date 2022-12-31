package com.driver.shared.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FoodDto{

	private long id;
	private String foodId;
	private String foodName;
	private String foodCategory;
	private float foodPrice;



}
