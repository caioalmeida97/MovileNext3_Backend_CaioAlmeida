package br.com.nextmovile.orders.domain;

import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductNameException;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductPriceException;

/**
 * Class used to represent a product
 * that is contained in a product list in {@link Order}.
 * <br><br> Also, it implements Builder and
 * Fluent Interface patterns.
 * 
 * @author Caio Almeida <caio.almeida1997@hotmail.com>
 */

public class Product {

	private String name;
	private int price;
	
	public static class Builder {
		
		private String name;
		private int price;
		
		/**
		 * If name is not provided (null or empty),
		 * it throws a {@link InvalidProductNameException}.
		 * 
		 * @param name
		 */
		
		public Builder(String name) {
			if(name.equals("") || name == null)
				throw new InvalidProductNameException("The product name must not be empty!");
			this.name = name;
		}
		
		public Builder(int price) {
			if(price == 0)
				throw new InvalidProductPriceException("The product price must be greater than zero!");
			this.price = price;
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
	
	private Product(Builder builder) {
		this.name = builder.name;
		this.price = builder.price;
	}
	
	@Override
	public String toString() {
		return "Product: " + name;
	}

}
