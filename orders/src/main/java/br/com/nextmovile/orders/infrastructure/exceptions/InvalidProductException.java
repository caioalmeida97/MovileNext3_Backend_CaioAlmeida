package br.com.nextmovile.orders.infrastructure.exceptions;

public class InvalidProductPriceException extends RuntimeException{
	
	private static final long serialVersionUID = 4655364871734168517L;

	public InvalidProductPriceException(String message) {
		super(message);
	}
}
