package com.dao;

import java.util.List;

import com.beans.Book;

public interface BookDAO {

	public boolean addBook(Book book);
	public int updateBook(Book book, String Isbn);
	public int deleteBook(String Isbn);
	public Book findBookByISBN(String Isbn);
	List<Book> findBooksByName(String name);
	List<Book> findAllBooks();
	List<Book> findBooksByAuthor(String auth_name);
	
	
}
