package br.com.nextmovile.orders.domain;

import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductNameException;

public class Product {
	
	private String name;
	
	public static class Builder {
		
		private String name;
		
		public Builder(String name) {
			if(name.equals(""))
				throw new InvalidProductNameException("The product name must not be empty!");
			this.name = name;
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
	
	private Product(Builder builder) {
		this.name = builder.name;
	}
	
	@Override
	public String toString() {
		return "Product: " + name;
	}

}
