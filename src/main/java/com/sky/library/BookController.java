package com.sky.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/retrieveBook/{bookReference}")
	public String retriveBook(@PathVariable String bookReference) throws BookNotFoundException {
		return bookService.retriveBook(bookReference);
	}
	
	@RequestMapping("/getBookSummary/{bookReference}")
	public String getBookSummary(@PathVariable String bookReference) throws BookNotFoundException {
		return bookService.getBookSummary(bookReference);
	}

}
