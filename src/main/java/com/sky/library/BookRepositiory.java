package com.sky.library;

public interface BookRepositiory {

	public String retriveBook(String bookReference)throws BookNotFoundException;
	public String getBookSummary(String bookReference)throws BookNotFoundException;
}
