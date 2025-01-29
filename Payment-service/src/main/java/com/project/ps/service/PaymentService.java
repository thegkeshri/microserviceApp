package com.project.ps.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ps.entity.Payment;
import com.project.ps.repository.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentrepo;
	
	public Payment doPayment(Payment payment) {
		
		payment.setPaymentStatus(paymentStatus());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentrepo.save(payment);
	}
	
	public String paymentStatus() {	
		//this response should come from 3rd party app like paypal, paytm, etc...
		return new Random().nextBoolean()?"SUCCESS":"FALSE";
	}
}
