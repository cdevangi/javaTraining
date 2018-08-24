package com.compare;

import java.util.Comparator;

import com.beans.Book;

public class MyComparator implements Comparator<Book> {

	
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		
		return ((int) (o1.getPrice() - o2.getPrice()));
	}

}
