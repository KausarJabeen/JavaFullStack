package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo6 {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
		//Step 2 - Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
		//Step 3 - Process the Result
		
		System.out.println(con);
		
		Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.TYPE_FORWARD_ONLY);
		
		
		ResultSet rs=stmt.executeQuery("select * from users");
		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getInt(4));
//		}
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
	}

}
