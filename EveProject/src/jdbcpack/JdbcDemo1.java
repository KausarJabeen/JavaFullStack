package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	//Step1 - Register or load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//Step 2 - Establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/eve","root","root");
	
	//Step 3 - Process the result
		
		System.out.println(con);
	}

}
