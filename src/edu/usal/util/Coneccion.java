package edu.usal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
	private Connection coneccion;
	
	public Coneccion() {
		coneccion=null;
	}
	
	public boolean iniciarConeccion() throws SQLException {
		try {
			Class.forName(PropertiesUtil.getDriver());
		this.coneccion = DriverManager.getConnection(PropertiesUtil.getConSQL(),PropertiesUtil.getUser(),PropertiesUtil.getPassword());	
		return true;
		} catch (ClassNotFoundException e) {
		}
		return false;	
	}
	
	public boolean cerrarConeccion()  throws SQLException {
		if(!this.coneccion.isClosed()) {
			this.coneccion.close();
			return true;
		}else {
			return false;
		}
	}

	public Connection getConeccion() {
		return coneccion;
	}

	public void setConeccion(Connection con) {
		this.coneccion = con;
	}
	
	
	
}
