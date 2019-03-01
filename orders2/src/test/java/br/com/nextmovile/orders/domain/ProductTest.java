package br.com.nextmovile.orders.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.nextmovile.orders.infrastructure.exceptions.EmptyProductNameException;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductPriceException;

public class ProductTest {

	@Test(expected=EmptyProductNameException.class)
	public void shouldFailIfProductNameIsNotGiven() {
		Product p = new Product("", 10, 10);
	}
	
	@Test(expected=InvalidProductPriceException.class)
	public void shouldFailIfProductPriceIsLessThanZero() {
		Product p = new Product("Caio", -10, 5);
	}
	
	
}