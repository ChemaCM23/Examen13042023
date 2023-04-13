package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import models.Provincia;



public class ProvinciaController {

private static Connection conn = null;
	
	public static List<Provincia> cargarProvincia() {
		List<Provincia> lc = new ArrayList<Provincia>();
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn.prepareStatement(
					"select * from provincia");
			ResultSet rs = ps.executeQuery();
			Provincia p = null;
			while (rs.next()) {
				p = new Provincia();
				p.setId(rs.getInt(1));
				p.setProvincia(rs.getString(2));
				lc.add(p);
			}
			rs.close();
			ps.close();
			conn.close();
			return lc;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int modificarProvincia(Provincia i) {
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn
					.prepareStatement("update provincia set provincia = ? where id = ?");

			ps.setString(1, i.getProvincia());
			ps.setInt(2, i.getId());
			;
			
			
			int rows = ps.executeUpdate();
			
			ps.close();
			conn.close();

			return rows;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return 0;

	}
}

