package br.com.nextmovile.orders.domain;

import java.util.ArrayList;
import java.util.List;

import br.com.nextmovile.orders.infrastructure.exceptions.InvalidClientNameException;

public class Order {
	
	private String client;
	private List<Product> products;
	
	public static class Builder {
		
		private String client;
		private List<Product> products;
		
		public Builder(String client) {
			if(client.equals(""))
				throw new InvalidClientNameException("The client name must not be empty!");
			this.client = client;
		}
		
		public Builder addItem(String productName) {
			if(products == null) {
				products = new ArrayList<Product>();
			}
			Product p = new Product.Builder(productName).build();
			products.add(p);
			return this;
		}
		
		public Order build() {
			return new Order(this);
		}
	}
	
	private Order(Builder builder) {
		this.client = builder.client;
		this.products = builder.products;
	}
	
	public List<Product> getProducts() {
		return this.products;
	}
}
