package com.beans;

import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable {
	
	private int isbn;
	private String name;
	private String publication;
	private double price;
	
	public Book() {
		isbn=-1;
		name=publication="";
		price=00;
	}

	public Book(int isbn, String name, String publication, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", price=" + price + "\n";
	}
	
	public boolean equals(Object arg0) {
		Book b = (Book) arg0;
		
		return this.isbn==b.isbn && this.name.equals(b.name) && this.publication.equals(b.publication) && this.price==b.price;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.length();
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(o.name);    //return this.isbn-o.isbn
	}
	
	
	

}
