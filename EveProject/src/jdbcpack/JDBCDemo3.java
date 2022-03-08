package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCDemo3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Step 1 - Load / Register the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
				//Step 2 - Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
				//Step 3 - Process the Result
				
				System.out.println(con);
				
				DatabaseMetaData dbmd=con.getMetaData();
				
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDriverName());
				System.out.println(dbmd.getDefaultTransactionIsolation());
				System.out.println(dbmd.getDatabaseProductVersion());
	}

}
