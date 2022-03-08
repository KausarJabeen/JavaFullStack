package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;

public class DBConnectionUtility {
	private static ThreadLocal<Connection> tLocal=new ThreadLocal<>();
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private DBConnectionUtility() {
		// TODO Auto-generated constructor stub
	}
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			con=tLocal.get();
			if(con==null) {
				con=DriverManager.getConnection("jdbc:mysql://localhost/eve","root","root");
				con.setAutoCommit(false);
				tLocal.set(con);				
			}
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void closeConnection(Exception exp,Savepoint sp) {
		try {
		con=tLocal.get();
		if(con!=null) {
			if(exp==null) {
				con.commit();
			}
			else {
				if(sp==null) {
					con.rollback();
				}
				else {
					con.rollback(sp);
					con.commit();
				}
			}
		}
		tLocal.remove();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
