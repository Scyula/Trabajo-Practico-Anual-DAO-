package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.AeropuertoDAOImplFIleStream;
import edu.usal.negocio.dao.interfaces.AeropuertoDAO;

public class AeropuertoFactory {
	public static AeropuertoDAO getAeropuertoDAO(){
		return new AeropuertoDAOImplFIleStream();
}
}
