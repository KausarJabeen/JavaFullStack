package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;

public class JDBCDemo11a {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver of MySQL
		//Step 2 - Establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eve","root","root");
		System.out.println(con);
		
		//Step 3 - Process the Result
		
				con.setAutoCommit(false);
				try {
				String drname="somu";
				String crname="mohana";
				int amount=500;
				int amt=0;
				PreparedStatement stmt=con.prepareStatement("select amt from users where uname=?");
				stmt.setString(1, drname);
				
				ResultSet rs=stmt.executeQuery();
				if(rs.next()) {
					amt=rs.getInt("amt");
					if(amt>amount) {
						amt=amt-amount;
						stmt=con.prepareStatement("update users set amt=? where uname=?");
						stmt.setInt(1, amt);
						stmt.setString(2, drname);
						stmt.executeUpdate();			
					}
					else {
						throw new LowBalanceException();
					}
				}
				else {
					throw new InvalidUserException();
				}
				
				stmt=con.prepareStatement("select amt from users where uname=?");
				stmt.setString(1, crname);
				
				rs=stmt.executeQuery();
				if(rs.next()) {
					amt=rs.getInt("amt");
					amt=amt+amount;
					stmt=con.prepareStatement("update users set amt=? where uname=?");
					stmt.setInt(1, amt);
					stmt.setString(2, crname);
					stmt.executeUpdate();
				}
				else {
					throw new InvalidUserException();
				}
				con.commit();
				}catch(Exception e) {
					e.printStackTrace();
					con.rollback();
				}
			}
		}
		class LowBalanceException extends Exception{
			
		}
		class InvalidUserException extends Exception{}