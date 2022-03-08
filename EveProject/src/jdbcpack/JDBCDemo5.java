package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
		//Step 2 - Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
		//Step 3 - Process the Result
		
		System.out.println(con);
		
		Statement stmt= con.createStatement();
		
		String sql="create table users (uid int(5), uname varchar(30), upass varchar(8), flag int(1))";
//		sql="insert into users values (1,'rahim','secret',0)";
//		stmt.execute(sql);
		sql="insert into users values (3,'basha','secret',0)";
		
		boolean result=stmt.execute(sql);
		System.out.println("For queries which does not return resultset.."+result);
		
		result=stmt.execute("select * from users");//this will return a resultset
		System.out.println("For queries which returns a resultset..:"+result);
		
	}

}
