package com.project.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.os.common.OrderRequestDTO;
import com.project.os.common.Payment;
import com.project.os.repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo orderRepo;
	@Autowired
	RestTemplate template;
	
	public OrderRequestDTO saveorder(OrderRequestDTO orderReq) {
		String message="";
		Payment payment=orderReq.getPayment();
		payment.setOrderid(orderReq.getOrder().getId());
		payment.setAmt(orderReq.getOrder().getAmt());
		
		Payment paymentresponse=template.postForObject("http://Payment-service/payment/doPayment", payment, Payment.class);
		message=paymentresponse.getPaymentStatus().equalsIgnoreCase("SUCCESS")?"Ordered succesfully!!" : "payment failed!!";
		orderReq.setMessage(message);
		orderRepo.save(orderReq.getOrder());
		 return new OrderRequestDTO(orderReq.getOrder(),paymentresponse, message);
	}
}
