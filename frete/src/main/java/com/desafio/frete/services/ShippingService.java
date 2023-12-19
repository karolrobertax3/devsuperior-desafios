package com.desafio.frete.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public double discount(double amount) {
		double frete = 0.0;
		if (amount < 100) {
			frete = amount + 20;
		}else if (amount >= 100 && amount <= 200 ) {
			frete = amount + 12;
		}
		else {
			frete = amount;
		}
		return frete;
	}

}
