package br.com.nextmovile.orders.infrastructure.exceptions;

public class InvalidProductWeightException extends RuntimeException {

	private static final long serialVersionUID = 4655364871734168517L;
	
	public InvalidProductWeightException(String message) {
		super(message);
	}
}
