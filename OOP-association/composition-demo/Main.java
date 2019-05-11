package com.burak.assocciation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book("Gambler", "Dostoyevski");
		Book book2 = new Book("Miserables", "Victor Hugo");
		Book book3 = new Book("War and Peace", "Tolstoy");
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		Library library = new Library(books);
		for (Book book : library.getTotalBooks()) {
			System.out.println("Title: " + book.title + " - Author: " + book.author);
		}
	}
}
