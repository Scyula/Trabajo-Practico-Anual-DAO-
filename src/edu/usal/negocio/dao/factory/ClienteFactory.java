package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.ClienteDAOImplFileStream;
import edu.usal.negocio.dao.interfaces.ClienteDAO;

public class ClienteFactory {
	public static ClienteDAO getClienteDAO(){
		return new ClienteDAOImplFileStream();
}
}
