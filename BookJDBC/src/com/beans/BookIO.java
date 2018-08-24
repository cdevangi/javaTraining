package com.beans;

import java.util.Scanner;

public class BookIO {
	
	public Book getDetailsFromUser() {
		
		Book b = new Book();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter following book details: ");
		System.out.println("ISBN: ");
		b.setIsbn(in.nextLine());
		System.out.println("Name: ");
		b.setName(in.nextLine());
		System.out.println("Pub: ");
		b.setPublication(in.nextLine());
		System.out.println("Author: ");
		b.setAuthor(in.nextLine());

		return b;
		
	}

}
