package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbConnection;
import entitys.User;

public class UserDAO {

	public User checkLogin(String user, String password) {
		
		
		String sql = "SELECT * FROM USUARIOS WHERE USUARIO = ? and CONTRASEÑA = ?";
		Connection con = DbConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user);
	        ps.setString(2, password);
	        ResultSet result = ps.executeQuery();
	        
	        User usr = null;
	        if (result.next()) {
	            usr = new User();
	            usr.setFullname(result.getString("fullname"));
	            usr.setEmail(user);
	        }
	        con.close();
	        return usr;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		
		return null;
	}
}
