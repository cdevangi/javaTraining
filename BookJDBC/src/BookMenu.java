import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.beans.BookDAOImpl;
import com.beans.BookIO;

public class BookMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		BookIO bio = new BookIO();
		BookDAOImpl impl = new BookDAOImpl();
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("*** MENU ***");
			System.out.println("1.Add book  2. Update Book  3.Display All   4.Find by name  5.Find by author  6. Find by ISBN");
			int ch = in.nextInt();
			in.nextLine();
			switch(ch) {
			case 1: Book b = bio.getDetailsFromUser();
					if(impl.addBook(b))
						System.out.println("Book added successfully");
					else
						System.out.println("Error in adding book");
					break;
					
			case 2: String pub,isbn;
					b = new Book();
					System.out.println("Enter ISBN of book to update:  ");
					isbn = in.nextLine();
					System.out.println("Enter PUBLICATION value to update: ");
					pub=in.nextLine();
					b.setPublication(pub);
					
					if(impl.updateBook(b, isbn) > 0) {
						System.out.println("Row updated successfully");
					}
					break;
					
			case 3: List<Book> books = impl.findAllBooks();
					for(Book b1:books) {
						System.out.println(b1);
					}
					break;
					
			case 4: System.out.println("Enter name of book to search: ");
					List<Book> books1 = impl.findBooksByName(in.nextLine());
					
					if(books1.isEmpty()) {
						System.out.println("No book found by the given name");
						break;
					}
					for(Book n:books1) {
						System.out.println(n);
					}
					break;
					
			case 5: System.out.println("Enter author of book to search: ");
					List<Book> authbook = impl.findBooksByAuthor(in.nextLine());
					
					if(authbook.isEmpty()) {
						System.out.println("No book found by the given author");
						break;
					}
					for(Book a:authbook) {
						System.out.println(a);
					}
					break;
					
			case 6: System.out.println("Enter ISBN of book to search");
					Book book = impl.findBookByISBN(in.nextLine());
					
					if(book.getIsbn().equals("-")) {
						System.out.println("No book found with given ISBN");
						break;
					}
					
					System.out.println(book);
					break;
			
			}
			
			System.out.println("Try another option? Press 1");
			cont = in.nextInt();
			in.nextLine();
		}while(cont == 1);
		
		
		

	}

}
