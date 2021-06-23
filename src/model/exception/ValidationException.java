package model.exception;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Map<String, String> errors = new HashMap<String, String>();

	public ValidationException(String msg) {
		super(msg);
	}

	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

}