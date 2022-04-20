package br.com.posarquiteturapuc2022.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 8401373259827090227L;

	public ObjectNotFoundException(String message) {
		super(message);
	}
}
