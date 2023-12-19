package com.desafio.frete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.frete.entities.Order;
import com.desafio.frete.services.OrderService;

@SpringBootApplication
public class FreteApplication  implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(FreteApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(1034,150.00, 0.2 );

		System.out.println("Código do pedido: " +order.getCode() +"\nValor total: R$ "+ orderService.total(order));
	}

}
