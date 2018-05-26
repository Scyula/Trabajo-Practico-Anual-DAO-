package zzprueba;

import java.io.IOException;
import java.util.Hashtable;

import edu.usal.negocio.dao.interfaces.PaisesDAO;
import edu.usal.negocio.dao.interfaces.ProvinciasDAO;
import usal.edu.negocio.dao.implementacion.PaisesDAOImplFileString;
import usal.edu.negocio.dao.implementacion.ProvinciasDAOImplFileString;

public class ejecutar {
	
	public static void main(String[] args) {
		ProvinciasDAO provincias = new ProvinciasDAOImplFileString();
		PaisesDAO paises = new PaisesDAOImplFileString();
		try {
			Hashtable<Integer,String> lista = provincias.leerProvincias();
			Hashtable<Integer,String> lista2 = paises.leerPaises();
			
			for(int i=1;i<24;i++) {
				System.out.println("-->"+lista.get(i));
			}
			for(int i=1;i<195;i++) {
				System.out.println("-->"+lista2.get(i));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
		
