package com.project.os.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.os.common.OrderRequestDTO;
import com.project.os.service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping(value="bookOrder")
	public ResponseEntity<OrderRequestDTO> bookOrder(@RequestBody OrderRequestDTO orderReq){
		
		return new ResponseEntity<OrderRequestDTO>(orderService.saveorder(orderReq), HttpStatus.OK);
	}
}
