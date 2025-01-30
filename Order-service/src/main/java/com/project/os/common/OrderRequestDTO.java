package com.project.os.common;

import com.project.os.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OrderRequestDTO {

	private Order order;
	private Payment payment;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public OrderRequestDTO(Order order, Payment payment, String message) {
		super();
		this.order = order;
		this.payment = payment;
		this.message = message;
	}
	
	
}
