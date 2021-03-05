package com.pdcase.employee.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2311667845554759981L;

	public EmployeeNotFoundException(Long id) {

		super("could find the employee id : "+ id);
	}
}
