package com.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.interfaces.BookOperations;

public class BookOperationsImplementation implements BookOperations {

	private List<Book> b;
	
	public BookOperationsImplementation() {
		
		b=new ArrayList<Book>();
	}
	
	public BookOperationsImplementation(List<Book> b) {
		super();
		this.b = b;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		
		if(b.add(book))
			return 1;
		else
			return 0;
		
		
	}

	@Override
	public Boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		
		return b.remove(book);
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		Book current=new Book();
		
		int id = book.getIsbn();
		
		Iterator<Book> it = b.iterator();
		while(it.hasNext()) {
			
			current = it.next();
			if(current.getIsbn()==id)
				return current;
			
		}
		
		return current;
			
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		
		List<Book> booksFound = new ArrayList<Book>();
		
		Iterator<Book> it = b.iterator();
		while(it.hasNext()) {
			
			Book current = it.next();
			if(current.getName().equals(book_name))
				booksFound.add(current);
		}
		
		return booksFound;
	}

}
