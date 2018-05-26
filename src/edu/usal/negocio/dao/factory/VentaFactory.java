package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.VentaDAOImplFileStream;
import edu.usal.negocio.dao.interfaces.VentaDAO;

public class VentaFactory {
	public static VentaDAO getVentaDAO(){
		return new VentaDAOImplFileStream();
}
}
