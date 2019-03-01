package br.com.nextmovile.orders.application;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nextmovile.orders.domain.Client;
import br.com.nextmovile.orders.domain.Order;
import br.com.nextmovile.orders.domain.responses.Response;
import br.com.nextmovile.orders.infrastructure.service.OrderService;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<Response<List<Order>>> listAll() {
		return ResponseEntity.ok(new Response<List<Order>>(this.orderService.listAll()));
	}
	
	@GetMapping (path = "/{id}")
	public ResponseEntity<Response<Order>> findById(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Order>(this.orderService.findById(id)));
	}
	
	@GetMapping (path = "/{name}")
	public ResponseEntity<Response<Client>> findClientByName (@PathVariable(name = "id") String name) {
		// Not implemented
		return null;
	}
	
	@PostMapping
	public ResponseEntity<Response<Order>> newOrder(@Valid @RequestBody Order order, BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Order>(errors));
		}
		return ResponseEntity.ok(new Response<Order>(this.orderService.newOrder(order)));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Order>> update(@PathVariable(name = "id") String id, @Valid @RequestBody Order order, BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Order>(errors));
		}
		order.setId(id);
		return ResponseEntity.ok(new Response<Order>(this.orderService.update(order)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") String id) {
		this.orderService.remove(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
	
}
