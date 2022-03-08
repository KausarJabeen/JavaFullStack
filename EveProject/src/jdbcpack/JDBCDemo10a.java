package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
//Procedure 2
public class JDBCDemo10a {

	public static void main(String[] args)throws Exception {
		//Step1 - Register or load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	//Step 2 - Establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/eve","root","root");
	
	//Step 3 - Process the result
		
		CallableStatement cs=con.prepareCall("{call proc1()}");
		
//		int noofrowsupdated=cs.executeUpdate();
//		
//		System.out.println("No of rows updated...:"+noofrowsupdated);
		cs=con.prepareCall("{call proc2(?)}");
		
		cs.setInt(1, 1);
		
		cs.execute();
	}
}