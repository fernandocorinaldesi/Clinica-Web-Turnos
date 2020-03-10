package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DbConnection;
import entitys.Turn;

public class TurnDAO {
	public ArrayList<Turn> getTurn() {
		System.out.println("pase por aqui");
		String turnlist = "SELECT T.ID, T.DNI, T.NOMBRE, T.APELLIDO,T.FECHA ,T.HORA ,T.CONSULTORIO ,T.MEDICO FROM TURNO T ";
		ArrayList<Turn> turn = new ArrayList<Turn>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(turnlist);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Turn t = new Turn(rs.getInt("ID"), rs.getInt("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
						rs.getDate("FECHA").toString(), rs.getTime("HORA").toString(), rs.getInt("CONSULTORIO"),
						rs.getString("MEDICO"));

				turn.add(t);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return turn;
	}
}
