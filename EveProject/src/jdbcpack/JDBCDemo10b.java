package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;
//Procedure 3
public class JDBCDemo10b {

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
		
		/*Procedue 2*/
//		cs=con.prepareCall("{call proc2(?)}");
//		
//		cs.setInt(1, 1);
//		
//		cs.execute();
		cs=con.prepareCall("{call proc3(?,?)}");
		
		cs.setString(1, "rahim");
		
		cs.registerOutParameter(2, Types.INTEGER);
		
		cs.execute();
		
		int flag=cs.getInt(2);
		System.out.println("The flag value of rahim is...:"+flag);
	}
}