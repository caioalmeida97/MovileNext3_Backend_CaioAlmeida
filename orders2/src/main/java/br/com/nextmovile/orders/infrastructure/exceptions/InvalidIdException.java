package br.com.nextmovile.orders.infrastructure.exceptions;

public class InvalidIdException extends RuntimeException{
	
	private static final long serialVersionUID = 4655364871734168517L;

	public InvalidIdException(String message) {
		super(message);
	}
}
