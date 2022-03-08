package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Step 1 - Load / Register the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
				//Step 2 - Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
				//Step 3 - Process the Result
				
				System.out.println(con);
				
				System.out.println(con.getAutoCommit());
				con.setAutoCommit(false);
				System.out.println(con.getAutoCommit());
				
				System.out.println(con.getTransactionIsolation());
				
				con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
				System.out.println(con.getTransactionIsolation());
				int transLevel=con.getTransactionIsolation();
				
				switch(transLevel) {
				case Connection.TRANSACTION_READ_COMMITTED:{
					System.out.println("Transaction read committed....");
					break;
				}
				case Connection.TRANSACTION_READ_UNCOMMITTED:{
					System.out.println("Transaction read un committed....");
					break;
				}
				case Connection.TRANSACTION_REPEATABLE_READ:{
					System.out.println("Transaction repeat read....");
					break;
				}
				case Connection.TRANSACTION_SERIALIZABLE:{
					System.out.println("Transaction serializable...");
					break;
				}
				}
				
	}

}
