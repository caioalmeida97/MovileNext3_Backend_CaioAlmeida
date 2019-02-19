package br.com.nextmovile.orders.infrastructure.exceptions;

public class InvalidClientNameException extends RuntimeException{
	
	private static final long serialVersionUID = 4655364871734168517L;

	public InvalidClientNameException(String message) {
		super(message);
	}
}
