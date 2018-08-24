import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.EmployeeIO;
import com.pojo.EmployeeIOImpl;

public class TestIOImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeIOImpl e1 = new EmployeeIOImpl();
		Employee emp = e1.readEmployee();
		e1.writeEmployee(emp);
		
		EmployeeIO obj = new EmployeeIO() {

			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				
				Scanner in = new Scanner(System.in);
				Employee e = new Employee();
				System.out.println("Enter id and salary: ");
				e.setEmpID(in.nextInt());
				e.setEmpSalary(in.nextDouble());
				return e;
			}

			@Override
			public void writeEmployee(Employee e) {
				// TODO Auto-generated method stub
				
				System.out.println("ID: "+e.getEmpID());
				System.out.println("Salary: "+e.getEmpSalary());

			}
			
		};
		
		Employee e  = obj.readEmployee();
		System.out.println(e);
		

	}

}
