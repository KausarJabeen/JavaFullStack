package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class JDBCDemo11 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Step1 - Register or load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 - Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/eve","root","root");
		System.out.println(con);
		//Step 3 - Process the result
				Savepoint sp=null;
				Statement st=con.createStatement();
				try {
					con.setAutoCommit(false); 
					st.execute("update java_teacher set subject_taught=10 where tid=1");
					sp=con.setSavepoint();
					
					st.execute("update java_course set taught=10 where sid=1") ;
					
					st.execute("update java_course set learned=10 where siid=1");
				con.commit();
				} catch(Exception e) {
					e.printStackTrace();
					con.rollback(sp);
					con.commit();
				}
			}
}
	
