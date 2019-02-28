package br.com.nextmovile.orders.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nextmovile.orders.domain.Order;
import br.com.nextmovile.orders.infrastructure.service.OrderService;

@RestController
@RequestMapping(path = "/api/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> listAll() {
		return ResponseEntity.ok(this.orderService.listAll());
	}
	
	@GetMapping (path = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(this.orderService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Order> newOrder(@RequestBody Order order) {
		return ResponseEntity.ok(this.orderService.newOrder(order));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Order> update(@PathVariable(name = "id") String id, @RequestBody Order order) {
		order.setId(id);
		return ResponseEntity.ok(this.orderService.update(order));
	}
	
	@DeleteMapping(path = "/{id")
	public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id) {
		this.orderService.remove(id);
		return ResponseEntity.ok(1);
	}
	
	@GetMapping (path = "/whatever")
	public ResponseEntity<String> whatever() {
		return ResponseEntity.ok("<h1>TEST</h1>");
	}
}
