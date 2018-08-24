import com.pojos.Employee;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao = new EmployeeDAO();
		Employee updated = dao.updateEmployee(3, new Employee(0,"citi",15000));
		System.out.println(updated.getName()+": "+updated.getSalary());

	}

}
