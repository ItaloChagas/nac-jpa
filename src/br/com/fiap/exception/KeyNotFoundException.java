package br.com.fiap.exception;

public class KeyNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public KeyNotFoundException() {
		super();
	}

	public KeyNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public KeyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public KeyNotFoundException(String message) {
		super(message);
	}

	public KeyNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
