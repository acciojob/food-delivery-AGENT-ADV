package com.driver.io.entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String orderId;

	@Column(nullable = false)
	private float cost;

	@Column(nullable = false)
	private String[] items;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false)
	private boolean status;


}
