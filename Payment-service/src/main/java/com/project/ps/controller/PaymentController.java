package com.project.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ps.entity.Payment;
import com.project.ps.service.PaymentService;

@RestController
@RequestMapping(value="/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping(value="/doPayment")
	public ResponseEntity<Payment> doPayment(@RequestBody Payment payment){
		
		return new ResponseEntity<Payment>(paymentService.doPayment(payment), HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getPaymentHistory")
	public ResponseEntity<List<Payment>> getPaymentHistory(){
		
		return new ResponseEntity<List<Payment>>(paymentService.getPaymentHistory(), HttpStatus.OK);
		
	}
}
