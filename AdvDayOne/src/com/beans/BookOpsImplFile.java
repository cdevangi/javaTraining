package com.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.interfaces.BookOperations;

public class BookOpsImplFile implements BookOperations {
	
	List<Book> b;
	
	public BookOpsImplFile() {

		b=new ArrayList<Book>();
	}
	
	public BookOpsImplFile(List<Book> b) {
		super();
		this.b = b;
	}

	public boolean writeDataToFile(List<Book>books) {
		
		try {
			FileOutputStream fo = new FileOutputStream("book.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			
			os.writeObject(books.toArray());
			os.close();
			fo.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public List<Book> readDataFromFile(){
		
		List<Book> readF = new ArrayList<Book>();
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("book.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			if(oi.available()>0) {
				readF.add((Book)oi.readObject());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return readF;
		
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		
		List<Book> temp = new ArrayList<Book>();
		
		File f = new File("book.txt");
		if(f.exists())
			temp = readDataFromFile();
		
		boolean add = temp.add(book);
		
		if(writeDataToFile(temp) && add)
			return 1;	
	
		
		
		return 0;
	}

	@Override
	public Boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		List<Book> temp = new ArrayList<Book>();
		temp = readDataFromFile();
		
		if(temp.remove(book)) {
			System.out.println("Book removed succesfully!");
			return true;
		}
			
		return false;
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		
		Book current = new Book();
		List<Book> temp = new ArrayList<Book>();
		temp = readDataFromFile();
		Iterator<Book> it = temp.iterator();
		while(it.hasNext()) {
			current = it.next();
			if(current.getIsbn() == book.getIsbn()) {
				System.out.println("Book found -->");
				return current;
			}
		}
			
		return current;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		
		List<Book> found = new ArrayList<Book>();
		List<Book> temp = new ArrayList<Book>();
		temp = readDataFromFile();
		
		Iterator<Book> it = temp.iterator();
		while(it.hasNext()) {
			Book t = it.next();
			if(t.getName().equals(book_name)) {
				found.add(t);
			}
		}
		
		return found;
	}

}
