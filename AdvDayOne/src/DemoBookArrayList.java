import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1234,"ar","my pub",150));
		books.add(new Book());
		books.add(new Book(343,"sql","my pub",200));
		books.add(new Book());
		
		System.out.println("No of books: "+books.size());
		
		System.out.println(books);
		
		Book search = new Book(343,"sql","my pub",200);
		
		Boolean found = books.contains(search);
		if(found)     
			System.out.println("Book "+search.getName()+" is available");
		else
			System.out.println("not found");
		
		Boolean removed = books.remove(search);
		System.out.println("removed: "+removed);
		
		System.out.println("No of books: "+books.size());
		
		
		
		
		
		
	}

}
