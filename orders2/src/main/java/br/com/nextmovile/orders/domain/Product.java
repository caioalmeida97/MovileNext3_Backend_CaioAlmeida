package br.com.nextmovile.orders.domain;

import br.com.nextmovile.orders.infrastructure.exceptions.EmptyProductNameException;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductPriceException;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductWeightException;

public class Product {
	private String name;
	private double price;
	private double weight;
	
	public Product(String name, double price, double weight) {
		if (name == null || name.equals(""))
			throw new EmptyProductNameException("Product name must not be null/empty");
		this.name = name;
		
		if (price <= 0)
			throw new InvalidProductPriceException("Product price must be greater than zero");
		this.price = price;
		
		if (weight <= 0)
			throw new InvalidProductWeightException("Product weight must be greater than zero");
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
