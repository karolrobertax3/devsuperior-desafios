package com.desafio.frete.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.frete.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		var desconto = order.getBasic() * order.getDiscount();
		var total = order.getBasic() - desconto;
		return shippingService.discount(15.15);
	}
	
}
