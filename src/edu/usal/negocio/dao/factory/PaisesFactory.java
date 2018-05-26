package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.PaisesDAOImplFileString;
import edu.usal.negocio.dao.interfaces.PaisesDAO;

public class PaisesFactory {
	public static PaisesDAO getPaisesDAO(){
			return new PaisesDAOImplFileString();
	}
}
