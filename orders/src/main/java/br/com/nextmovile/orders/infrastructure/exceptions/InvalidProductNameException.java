package br.com.nextmovile.orders.infrastructure.exceptions;

public class InvalidProductNameException extends RuntimeException{
	
	private static final long serialVersionUID = 4655364871734168517L;
	
	public InvalidProductNameException(String message) {
		super(message);
	}
}
