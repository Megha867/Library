package com.sky.library;

public class Book {
	
	private String book_reference;
	private String book_title;
	private String book_summary;
	
	
	
	public Book(String book_reference, String book_title, String book_summary) {
		super();
		this.book_reference = book_reference;
		this.book_title = book_title;
		this.book_summary = book_summary;
	}
	public String getBook_reference() {
		return book_reference;
	}
	public void setBook_reference(String book_reference) {
		this.book_reference = book_reference;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_summary() {
		return book_summary;
	}
	public void setBook_summary(String book_summary) {
		this.book_summary = book_summary;
	}
	
	@Override
	public String toString() {
		return "Book [book_reference=" + book_reference + ", book_title=" + book_title + ", book_summary="
				+ book_summary + "]";
	}
	
	
	
	

}
