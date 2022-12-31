package com.driver.model.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OperationStatusModel {

	private String operationResult;
	private String operationName;


}
