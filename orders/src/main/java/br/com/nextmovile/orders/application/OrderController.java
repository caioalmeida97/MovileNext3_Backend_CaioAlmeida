package br.com.nextmovile.orders.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/")
	public String home() {
		return "<h1> Hello World! </h1>";
	}
	
	@RequestMapping("/random")
	public String batata() {
		return "<h2> Welcome to the random route! </h2>";
	}


}
