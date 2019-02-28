package br.com.nextmovile.orders.infrastructure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextmovile.orders.domain.Order;
import br.com.nextmovile.orders.infrastructure.OrderRepository;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidIdException;
import br.com.nextmovile.orders.infrastructure.exceptions.NullOrderException;

@Service
public class OrderServiceImplementation implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> listAll() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order findById(String id) {
		if (id == null || id.equals(""))
			throw new InvalidIdException("Id must not be null");
		return orderRepository.findById(id).orElse(null);
	}

	@Override
	public Order newOrder(Order order) {
		if (order == null) 
			throw new NullOrderException("Order must not be null");
		return this.orderRepository.save(order);
	}

	@Override
	public Order update(Order order) {
		if (order == null) 
			throw new NullOrderException("Order must not be null");
		return this.orderRepository.save(order);
	}

	@Override
	public void remove(String id) {
		if (id == null || id.equals(""))
			throw new InvalidIdException("Id must not be null");
		this.orderRepository.deleteById(id);
	}

}
