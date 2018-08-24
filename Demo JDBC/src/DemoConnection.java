import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=javadb", "sa", "sa123");
			System.out.println("Connection successful");
			
			String INSERT_EMPLOYEE = "INSERT INTO EMPLOYEE VALUES(2,'Meghna',20000)";
			
		    Statement st = conn.createStatement();
			int rows = st.executeUpdate(INSERT_EMPLOYEE);
			
			System.out.println("Rows inserted : "+rows);
			
			
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
