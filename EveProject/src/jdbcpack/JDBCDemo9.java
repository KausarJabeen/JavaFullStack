package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCDemo9 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Step1 - Register or load the driver
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			
			//Step 2 - Establish the connection
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/eve","root","root");
			
			//Step 3 - Process the result
				
				System.out.println(con);
				
				PreparedStatement ps=con.prepareStatement("select * from users where uid=?");
				
//				Scanner scan=new Scanner(System.in);
//				while(true) {
//					System.out.println("Enter the UID..To get the username:");
//					int userid=scan.nextInt();
//					ps.setInt(1, userid);
//						ResultSet rs=ps.executeQuery();
//						if(rs.next()) {
//							System.out.println(rs.getString("uname"));
//						}
//				}
				int flag=1;
				String uname="basha";
				ps=con.prepareStatement("update users set flag=? where uname=?") ;
				ps.setInt(1, flag);
				ps.setString(2, uname);
				
				ps.execute();
	}

}
