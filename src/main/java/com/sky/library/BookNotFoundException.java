package com.sky.library;

public class BookNotFoundException extends Exception{
	
	String message;

	public BookNotFoundException(String message) {
		super(message);
	}
	

}
