import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class DemoFetch {

	public static void main(String[] args) {
		
		Connection conn = MyConnection.getMyConnection();
		try {
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String FIND_ALL_EMPS = "select * from employee";
			ResultSet rs = st.executeQuery(FIND_ALL_EMPS);
			
			DatabaseMetaData dm = conn.getMetaData();
			System.out.println(dm.getDatabaseProductName());
			
			ResultSetMetaData rmd = rs.getMetaData();
			System.out.println("no of columns: "+rmd.getColumnCount());
			
			for(int i=1;i<=rmd.getColumnCount();i++) {
				System.out.println(rmd.getColumnLabel(i));
			}
			
//			while(rs.next()) {
//				System.out.println("id:"+rs.getInt(1)+", name: "+rs.getString(2)+", sal:"+rs.getInt(3) );
//				rs.updateInt(3, 20000);
//				rs.updateRow();
//				System.out.println("id:"+rs.getInt(1)+", name: "+rs.getString(2)+", sal:"+rs.getInt(3) );
//				System.out.println("--------------------------------------");
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
