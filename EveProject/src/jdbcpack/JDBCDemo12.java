package jdbcpack;

import java.sql.Connection;
import java.sql.Savepoint;

public class JDBCDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savepoint sp=null;
		try {
			UserDAO userDAO=new UserDAOImpl();
			
			Connection con=DBConnectionUtility.getConnection();
			
			UserDTO userDTO=userDAO.findById(1, con);
					
			System.out.println(userDTO);
			
			userDTO.setUid(6);
			userDTO.setUname("zackriah");
			
			userDAO.createUser(userDTO, con);
			
			sp=con.setSavepoint();
			
			userDTO.setUid(7);
			userDTO.setUname("navya");
			
			userDAO.createUser(userDTO, con);
			
			int i=1/0;
			
			DBConnectionUtility.closeConnection(null, null);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			DBConnectionUtility.closeConnection(e, null);
			DBConnectionUtility.closeConnection(e, sp);

		}
	}
}
