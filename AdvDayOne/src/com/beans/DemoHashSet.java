package com.beans;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book>books= new HashSet<Book>();
		books.add(new Book(1234,"ar","my pub",150));
		books.add(new Book());
		books.add(new Book(343,"sql","my pub",200));
		books.add(new Book());
		
		System.out.println(books.size());
		
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
