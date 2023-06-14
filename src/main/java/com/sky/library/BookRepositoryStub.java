package com.sky.library;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryStub implements BookRepositiory{
	
	static List<Book> list = new ArrayList<Book>();
	
	static {
	list.add(new Book("BOOK-GRUFF472", "The Grufflo","A mouse taking a walk in the woods."));
	list.add(new Book("BOOK-POOH222", "Winnie The Pooh","In the first volume, we meet all the friends"));
	list.add(new Book("BOOK-WILL987", "The Wind In The Willows","With the arrival of spring and fine weather outside the "));
	}
	
	@Override
	public String retriveBook(String bookReference) throws BookNotFoundException {
		if(bookReference.startsWith("BOOK-")) {
			Book b = list.stream().filter(e->e.getBook_reference().equals(bookReference)).findFirst().get();
			return b.getBook_title()+" ["+b.getBook_reference()+"]";
		}
		else {
			return new BookNotFoundException("Please enter valid book reference").toString();
		}
	}

	@Override
	public String getBookSummary(String bookReference) throws BookNotFoundException {
		String str="";
		String []arr = new String[9];
		if(bookReference.startsWith("BOOK-")) {
			Book b = list.stream().filter(e->e.getBook_reference().equals(bookReference)).findFirst().get();
			str+=b.getBook_title()+" ["+b.getBook_reference()+"] ";
			if(b.getBook_summary().split("\\s").length>9) {
				 arr=b.getBook_summary().split("\\s");
				    for(int i=0;i<=8;i++)
				    	str+=" "+arr[i];
				    str+="...";
			}
			else
			    str+=b.getBook_summary();
			return str;
		}
		else {
			return new BookNotFoundException("Please enter valid book reference").toString();
		}
	}

}
