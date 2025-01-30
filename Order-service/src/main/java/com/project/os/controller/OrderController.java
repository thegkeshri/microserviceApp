package com.project.os.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.os.common.OrderRequestDTO;
import com.project.os.entity.Order;
import com.project.os.service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping(value="/bookOrder")
	public ResponseEntity<OrderRequestDTO> bookOrder(@RequestBody OrderRequestDTO orderReq){
		
		return new ResponseEntity<OrderRequestDTO>(orderService.saveorder(orderReq), HttpStatus.OK);
	}
	
	@GetMapping(value="/getOrders")
	public ResponseEntity<List<Order>> getOrders(){
		
		return new ResponseEntity<List<Order>>(orderService.getOrders(), HttpStatus.OK);
	}
}
