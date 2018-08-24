package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookIO {
	
	public Book getBook();
	public void printBook(List<Book> books);
	public void printBook(Book book);

}