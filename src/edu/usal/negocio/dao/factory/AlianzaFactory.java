package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.AlianzaDAOImplFileString;
import edu.usal.negocio.dao.interfaces.AlianzasDAO;

public class AlianzaFactory {
	
	public static AlianzasDAO getAlianzaDAO(){
			return new AlianzaDAOImplFileString();
	}
}
