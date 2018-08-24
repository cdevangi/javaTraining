import java.util.Scanner;

import com.beans.Book;
import com.beans.BookIOImplementation;
import com.beans.BookOperationsImplementation;

public class BookMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookIOImplementation bi = new BookIOImplementation();
		BookOperationsImplementation boi = new BookOperationsImplementation();
		Scanner in = new Scanner(System.in);

		
		int cont = 0;
		int ch;
		
		do {
			
			System.out.println("***** MENU ***** \n 1. Add records 2. Update  3. Find by ID");
			ch=in.nextInt();
			switch(ch) {
			
			case 1:  if(boi.addBook(bi.getBook()) == 1)
				           System.out.println("Book added successfully!");
			         else
			        	   System.out.println("Problem adding book");
					
			         break; 
			         
			case 2:  System.out.println("Enter ID of book to update: ");
	         		 Book temp1 = new Book();
	         		 temp1.setIsbn(in.nextInt());
	         		 temp1 = boi.findBookById(temp1);
	         		 System.out.println("Current details: ");
	         		 bi.printBook(temp1);
	         		 System.out.println("What do you wish to update? \n 1.Name  2.Publication  3.Price");
	         		 int u = in.nextInt();
	         		 switch(u) {
	         		 case 1:  System.out.println("Enter updated name: ");
	         			      temp1.setName(in.next());
	         			      in.nextLine();
	         			      break;
	         		 case 2:  System.out.println("Enter updated pub name: ");
		    			      temp1.setPublication(in.next());
		    			      in.nextLine();
		    			      break;
	         		 case 3:  System.out.println("Enter updated price: ");
			   			      temp1.setPrice(in.nextDouble());
			   			      break;
	         		 }
	         		 
	         		 bi.printBook(temp1);
				
				     break;
			
			case 3:  System.out.println("Enter book ID to search: ");
			         Book temp = new Book();
			         temp.setIsbn(in.nextInt());
			         temp = boi.findBookById(temp);
			         if(temp.getIsbn()!=-1)
			         {
			        	 System.out.println("Book found with details:");
			        	 bi.printBook(temp);
			         }
			         else
			        	 System.out.println("Book not found");
			         
			         break;
			             		
			}
			
			System.out.println("Enter 1 to continue with another choice: ");
			cont=in.nextInt();
			
		}while(cont==1);
		
		in.close();
		
	}

}
