import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.beans.Book;
import com.beans.BookIOImplementation;
import com.beans.BookOpsImplFile;

public class BookFileMenu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BookOpsImplFile boi = new BookOpsImplFile();
		BookIOImplementation bi = new BookIOImplementation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cont = 0;
		int ch;
		
		do {
			

			System.out.println("***** MENU ***** \n 1. Add records 2. Update  3. Find by ID");
			ch=Integer.parseInt(br.readLine());
			switch(ch) {
			
			case 1:  if(boi.addBook(bi.getBook()) == 1)
				           System.out.println("Book added successfully!");
			         else
			        	   System.out.println("Problem adding book");
					
			         break; 
			         
			case 2:  System.out.println("Enter ID of book to update: ");
	         		 Book temp1 = new Book();
	         		 temp1.setIsbn(Integer.parseInt(br.readLine()));
	         		 temp1 = boi.findBookById(temp1);
	         		 System.out.println("Current details: ");
	         		 bi.printBook(temp1);
	         		 System.out.println("What do you wish to update? \n 1.Name  2.Publication  3.Price");
	         		 int u = Integer.parseInt(br.readLine());
	         		 switch(u) {
	         		 case 1:  System.out.println("Enter updated name: ");
	         			      temp1.setName(br.readLine());
	         			
	         			      break;
	         		 case 2:  System.out.println("Enter updated pub name: ");
		    			      temp1.setPublication(br.readLine());
		    		
		    			      break;
	         		 case 3:  System.out.println("Enter updated price: ");
			   			      temp1.setPrice(Double.parseDouble(br.readLine()));
			   			      break;
	         		 }
	         		 
	         		 bi.printBook(temp1);
				
				     break;
			
			case 3:  System.out.println("Enter book ID to search: ");
			         Book temp = new Book();
			         temp.setIsbn(Integer.parseInt(br.readLine()));
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
			
			System.out.println("Press 1 to continue: ");
			try {
				cont =Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(cont == 1);

	}

}
