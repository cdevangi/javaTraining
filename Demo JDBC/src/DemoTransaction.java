import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		try {
		    conn = MyConnection.getMyConnection();
			conn.setAutoCommit(false);
			
			Statement st = conn.createStatement();
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(920,'Meghna',20000)");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(930,'Meghna',20000)");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1,'Meghna',20000)");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(940,'Meghna',20000)");
			
			conn.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block;
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}

}
