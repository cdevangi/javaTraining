import java.util.Scanner;

import com.pojo.Logic;
import com.pojo.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logic l = new Logic();
		
		
		Student s[]=null;
		int ch=0;
		
		do {
		System.out.println("**** MENU ****\n1.Add 2.Display 3.Search");
		Scanner in = new Scanner(System.in);
		ch=in.nextInt();
		
		
		switch(ch) {
		
		case 1: s = l.readFromUser();
				l.writeStudents(s);
				break;
				
		case 2: l.writeToUser(s);
				break;
					
		case 3: int roll;
				System.out.println("Enter roll no to search: ");
				roll=in.nextInt();
				boolean flag = false;
				Student s1[]=l.readStudents();
				
				for(Student x:s) {
					if(roll==x.getRollNo())
						flag=true;	
				}
				
				if(flag)
					System.out.println("Student is present");
				else
					System.out.println("Student not found");
				
				break;
				
			
		}
		
		System.out.println("Press 1 to continue with another choice:");
		ch=in.nextInt();
		}while(ch==1);

	}
	

}