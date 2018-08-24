import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.pojos.Employee;

public class EmployeeDAO {
	
	public int addEmployee(Employee emp) {
		
		String INSERT_EMPLOYEE = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		
		try {
			
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			
			ps.setInt(1, emp.getEmpID());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
			
	}
	
	public List<Employee> findAllEmployees() {
		
		List <Employee> emps = new ArrayList<>();
		
		try {
			Statement st = MyConnection.getMyConnection().createStatement();
			String FIND_ALL_EMPS = "select * from employee";
			ResultSet rs = st.executeQuery(FIND_ALL_EMPS);
			
			while(rs.next()) {
			emps.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emps;	
	}
	
	public Employee findmployeeByID(int empID) {
		Employee e = new Employee();
		String FIND_EMPLOYEE = "SELECT * FROM EMPLOYEE WHERE EMPID = ?";
		
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_EMPLOYEE);
			ps.setInt(1,empID);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				e = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
	}
	
	public Employee updateEmployee(int empID, Employee e) {
		
		Employee emp = new Employee();
		String UPDATE_EMPLOYEE = "UPDATE EMPLOYEE SET SALARY = ? WHERE EMPID = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_EMPLOYEE);
			ps.setInt(1, e.getSalary());
			ps.setInt(2, empID);
			
			int row = ps.executeUpdate();
			
			if(row>0) {
				emp=findmployeeByID(empID);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return emp;
		
	}

}
