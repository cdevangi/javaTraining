package com.beans;


import java.util.Set;
import java.util.TreeSet;

import com.compare.MyComparator;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book>books= new TreeSet<>(new MyComparator());
		books.add(new Book(1234,"ar","my pub",250));
		books.add(new Book());
		books.add(new Book(343,"sql","my pub",200));
		
		System.out.println(books.size());
		System.out.println(books);

	}

}
