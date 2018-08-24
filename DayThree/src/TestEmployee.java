import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age,id;
		String name;
		Double sal;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name, age, id and salary: ");
		
		name=in.next();
		age=in.nextInt();
		id=in.nextInt();
		sal=in.nextDouble();
		
		Employee e = new Employee(age,name,id,sal);
		//e.display();
		System.out.println(e);
		
		in.close();
	}

}
