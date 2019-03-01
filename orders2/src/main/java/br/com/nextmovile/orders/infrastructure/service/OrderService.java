package br.com.nextmovile.orders.infrastructure.service;

import java.util.List;

import br.com.nextmovile.orders.domain.Client;
import br.com.nextmovile.orders.domain.Order;

public interface OrderService {

	List<Order> listAll();
	
	Order findById(String id);
	
	Order newOrder(Order order);
	
	Order update(Order order);
	
	void remove(String id);
	
	Client findClientById(String id);
	
}
