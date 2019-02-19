package br.com.nextmovile.orders.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.nextmovile.orders.infrastructure.exceptions.InvalidClientNameException;
import br.com.nextmovile.orders.infrastructure.exceptions.InvalidProductNameException;

public class OrderTest {

	@Test
	public void testConstructor() {
		Order order = new Order.Builder("Caio")
							   .build();
	}
	
	@Test
	public void shouldAddProductsCorrectly() {
		Order order = new Order.Builder("Caio")
							   .addItem("Computador")
							   .addItem("Tênis")
							   .build();
	}
	
	@Test(expected=InvalidProductNameException.class)
	public void shouldFailIfProductNameIsEmpty() {
		Order order = new Order.Builder("Caio")
							   .addItem("")
							   .build();
	}
	
	@Test(expected=InvalidClientNameException.class)
	public void shouldFailIfClientNameIsEmpty() {
		Order order = new Order.Builder("").build();
	}

}
