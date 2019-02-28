package br.com.nextmovile.orders.infrastructure.exceptions;

public class NullOrderException extends RuntimeException{
	
	private static final long serialVersionUID = 4655364871734168517L;

	public NullOrderException(String message) {
		super(message);
	}
	
}
