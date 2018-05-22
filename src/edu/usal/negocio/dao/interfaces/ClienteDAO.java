package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.usal.negocio.dominio.Cliente;

public interface ClienteDAO {
	public void addCliente(Cliente cliente) throws FileNotFoundException, IOException;
	public boolean updateCliente(Cliente cliente) throws FileNotFoundException, IOException;
	public boolean deleteCliente(Cliente cliente) throws FileNotFoundException, IOException;
	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException;
	public void saveAllCliente(List<Cliente> list) throws FileNotFoundException, IOException;
	
}
