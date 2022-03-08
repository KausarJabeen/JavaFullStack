package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCDemo7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
		//Step 2 - Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
		//Step 3 - Process the Result
		
		System.out.println(con);
		
		Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.TYPE_FORWARD_ONLY);
		
		
		ResultSet rs=stmt.executeQuery("select * from users");
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("No Of Columns..:"+rsmd.getColumnCount());
		int noofcolumns=rsmd.getColumnCount();
		
		for(int i=1;i<=noofcolumns;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t\t");
		}
		System.out.println("\n____________________________________________________________________________________");
		while(rs.next()) {
			for(int i=1;i<=noofcolumns;i++) {
				System.out.print(rs.getString(i)+"\t\t");
				
				System.out.print("|");
			}
			
			System.out.println("\n--------------------------------------------------------------------------------\n");
		}
	}

}
