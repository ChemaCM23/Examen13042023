package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Municipio;
import models.Provincia;



public class MunicipioController {

	private static Connection conn = null;

	public static List<Municipio> cargarMunicipios(int id) {
		List<Municipio> lc = new ArrayList<Municipio>();
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn.prepareStatement("select * from municipio where idProvincia = " + id);
			ResultSet rs = ps.executeQuery();
			Municipio i = null;
			while (rs.next()) {
				i = new Municipio();
				i.setId(rs.getInt(1));
				i.setCodMunicipio(rs.getInt(2));
				i.setNombre(rs.getString(3));
				Provincia pa = new Provincia();
				pa.setId(rs.getInt(4));
				i.setIdProvincia(pa);
				lc.add(i);
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
}
