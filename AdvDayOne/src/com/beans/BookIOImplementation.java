package com.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.interfaces.BookIO;

public class BookIOImplementation implements BookIO {

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		Book b=new Book();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter following book details -->");
		System.out.println("Name: ");
		b.setName(in.next());
		in.nextLine();
		System.out.println("ISBN: ");
		b.setIsbn(in.nextInt());
		System.out.println("Publication: ");
		b.setPublication(in.next());
		in.nextLine();
		System.out.println("Price: ");
		b.setPrice(in.nextDouble());
		
		in.close();
		
		return b;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		
		Iterator<Book> it = books.iterator();
		System.out.println("ISBN\tNAME\tPUB\tPRICE");
		System.out.println("-------------------------------------");
		while(it.hasNext()) {
			
			Book temp = it.next();
			System.out.println(temp.getIsbn()+"\t"+temp.getName()+"\t"+temp.getPublication()+"\t"+temp.getPrice());
		}
	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
		
		System.out.println(book);
		
	}
	
	

}

