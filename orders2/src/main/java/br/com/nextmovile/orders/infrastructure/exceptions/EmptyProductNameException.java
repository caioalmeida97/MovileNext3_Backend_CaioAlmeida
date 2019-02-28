package br.com.nextmovile.orders.infrastructure.exceptions;

public class EmptyProductNameException extends RuntimeException {
	
	private static final long serialVersionUID = 4655364871734168517L;
	
	public EmptyProductNameException(String message) {
		super(message);
	}
}
