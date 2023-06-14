package com.sky.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepositiory bookRepositiory;

	@Override
	public String retriveBook(String bookReference) throws BookNotFoundException {
		return bookRepositiory.retriveBook(bookReference);
		
	}

	@Override
	public String getBookSummary(String bookReference) throws BookNotFoundException {
		return bookRepositiory.getBookSummary(bookReference);
		
	}

}
