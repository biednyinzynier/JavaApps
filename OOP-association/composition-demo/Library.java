package com.burak.assocciation;

import java.util.List;

public class Library {
	
	private List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getTotalBooks(){
		return books;
	}
	
}
