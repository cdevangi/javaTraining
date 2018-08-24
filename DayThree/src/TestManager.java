import java.util.Scanner;

import com.pojo.Manager;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String department,name;
		int age,empID;
		double empSalary,incentive;
		
		System.out.println("Enter name, age, id, sal, incentive and department: ");
		
		Scanner in = new Scanner(System.in);
		
		name=in.next();
		age=in.nextInt();
		empID=in.nextInt();
		empSalary=in.nextDouble();
		incentive=in.nextDouble();
		department=in.next();
		
		Manager mg = new Manager(department, incentive, age, name, empID, empSalary);
		
		mg.display();
		
		in.close();

	}

}
