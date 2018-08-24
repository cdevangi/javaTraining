package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookOperations {

	public int addBook(Book book);
	public Boolean deleteBook(Book book);
	public Book findBookById(Book book);
	public List<Book> findBooksByName(String book_name);
}
