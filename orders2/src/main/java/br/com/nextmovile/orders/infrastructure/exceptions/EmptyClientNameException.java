package br.com.nextmovile.orders.infrastructure.exceptions;

public class EmptyClientNameException extends RuntimeException {

	private static final long serialVersionUID = 4655364871734168517L;
	
	public EmptyClientNameException(String message) {
		super(message);
	}
}
