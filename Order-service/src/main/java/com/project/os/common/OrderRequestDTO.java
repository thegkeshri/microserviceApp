package com.project.os.common;

import com.project.os.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {

	private Order order;
	private Payment payment;
	private String message;
}
