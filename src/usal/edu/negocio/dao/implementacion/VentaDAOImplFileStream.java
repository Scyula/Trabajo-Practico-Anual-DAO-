package usal.edu.negocio.dao.implementacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.usal.negocio.dao.interfaces.VentaDAO;
import edu.usal.negocio.dominio.Venta;

public class VentaDAOImplFileStream implements VentaDAO {

	@Override
	public boolean addVenta(Venta venta) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateVenta(Venta venta) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVentas(Venta venta) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Venta> getAllVenta() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAllVenta(List<Venta> list) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

	}

}
