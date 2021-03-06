package edu.usal.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import edu.usal.negocio.dao.implementacion.SQL.LineaAereaDAOImplSQL;
import edu.usal.negocio.dao.implementacion.String.AlianzaDAOImplFileString;
import edu.usal.negocio.dao.implementacion.String.PaisesDAOImplFileString;
import edu.usal.negocio.dao.implementacion.String.ProvinciasDAOImplFileString;
import edu.usal.negocio.dao.interfaces.AlianzasDAO;
import edu.usal.negocio.dao.interfaces.LineaAereaDAO;
import edu.usal.negocio.dao.interfaces.PaisesDAO;
import edu.usal.negocio.dao.interfaces.ProvinciasDAO;
import edu.usal.negocio.dominio.LineaAerea;

public class DatosEstaticos {
	
	private static final String source = "SQL";
	private static ArrayList<LineaAerea> aerolineas= cargarAerolineas();
	private static Hashtable<Integer, String> paises = cargarPaises();
	private static Hashtable<Integer, String> provincias = cargarProvincias();
	private static Hashtable<Integer, String> alianza = cargarAlianzas();


	public static ArrayList<LineaAerea> getAerolineas() {
		return aerolineas;
	}

	private static Hashtable<Integer, String> cargarAlianzas() {
		try {
			AlianzasDAO ali =  new AlianzaDAOImplFileString();
			return ali.leerAlianzas();
		} catch (IOException e) {
			IOGeneralDAO.pritln(">>>>>Ocurrio un error al leer las provincias<<<<<");
			IOGeneralDAO.pritln(e.getMessage());
		}	
		return new Hashtable<Integer, String>();
	}
	
	public static Hashtable<Integer, String> getPaises() {
		return paises;
	}


	public static Hashtable<Integer, String> getProvincias() {
		return provincias;
	}


	public static String getSource() {
		return source;
	}
	
	
	public static Hashtable<Integer, String> getAlianza() {
		return alianza;
	}

	private static ArrayList<LineaAerea> cargarAerolineas() {
		try {
			LineaAereaDAO lineaAerea = new LineaAereaDAOImplSQL();
			return lineaAerea.getAllLineaAerea();
			
		} catch (SQLException e) {
			IOGeneralDAO.pritln(">>>>>Ocurrio un error al leer las aerolineas de la base de datos<<<<<");
			IOGeneralDAO.pritln(e.getMessage());
		}
		return new ArrayList<LineaAerea>();
	}

	private static Hashtable<Integer, String> cargarPaises() {
		try {
			PaisesDAO paisesdao = new PaisesDAOImplFileString();
			return paisesdao.leerPaises();
			
		} catch (IOException e) {
			IOGeneralDAO.pritln(">>>>>Ocurrio un error al leer los paises<<<<<");
			IOGeneralDAO.pritln(e.getMessage());
		}		
		return new Hashtable<Integer, String>();
	}

	private static Hashtable<Integer, String> cargarProvincias() {
		try {
			ProvinciasDAO provinciasdao = new ProvinciasDAOImplFileString();
			return provinciasdao.leerProvincias();
		} catch (IOException e) {
			IOGeneralDAO.pritln(">>>>>Ocurrio un error al leer las provincias<<<<<");
			IOGeneralDAO.pritln(e.getMessage());
		}	
		return new Hashtable<Integer, String>();
	}

	public static void actualizarAerolineas() {
		try {
			LineaAereaDAO lineaAerea = new LineaAereaDAOImplSQL();
			aerolineas = lineaAerea.getAllLineaAerea();
		} catch (SQLException e) {
			IOGeneralDAO.pritln(">>>>>Ocurrio un error al leer las aerolineas de la base de datos<<<<<");
			IOGeneralDAO.pritln(e.getMessage());
		}		
	}

	
}
	
