package com.project.os.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ORDER_TB")
public class Order {
	
	@Id
	private int id;
	private String name;
	private int qty;
	private double amt;
}
