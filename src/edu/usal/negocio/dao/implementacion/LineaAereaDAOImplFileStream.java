package edu.usal.negocio.dao.implementacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.LineaAereaDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineaAerea;
import edu.usal.util.PropertiesUtil;

public class LineaAereaDAOImplFileStream implements LineaAereaDAO {
	private File file;
	private ObjectInputStream objInput;
	private ObjectOutputStream objOutput;
	private FileOutputStream fileOut;
	private FileInputStream fileIn;

	@Override
	public boolean addLineaAerea(LineaAerea lineaAerea) throws FileNotFoundException, IOException {
		List<LineaAerea> lista = this.getAllLineaAerea();
		lista.add(lineaAerea);
		return true;
	}

	@Override
	public boolean updateLineaAerea(LineaAerea lineaAerea) throws FileNotFoundException, IOException {
		List<LineaAerea> lista = this.getAllLineaAerea();
		for(LineaAerea la : lista){
			if(la.getNombre().equalsIgnoreCase(lineaAerea.getNombre())){
				la = lineaAerea;
				this.saveAllLineaAerea(lista);
				return true;
				}
		}
		return false;
	}

	@Override
	public boolean deleteLineaAerea(LineaAerea lineaAerea) throws FileNotFoundException, IOException {
		List<LineaAerea> lista = this.getAllLineaAerea();
		for(LineaAerea la : lista){
			if(la.getNombre().equals(lineaAerea.getNombre())){
				lista.remove(la);
				this.saveAllLineaAerea(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<LineaAerea> getAllLineaAerea() throws FileNotFoundException, IOException {
		this.file= new File(PropertiesUtil.getPathLineaAerea(),PropertiesUtil.getNameLineaAerea());
		if(!file.exists()){
			file = new File(PropertiesUtil.getPathLineaAerea());
			file.mkdirs();
			file= new File(PropertiesUtil.getPathLineaAerea(), PropertiesUtil.getNameLineaAerea());
			file.createNewFile();
			this.saveAllLineaAerea(new ArrayList<LineaAerea>());
			return new ArrayList<LineaAerea>();
		}
		this.fileIn = new FileInputStream(this.file);
		this.objInput = new ObjectInputStream(this.fileIn);
		try {
			List<LineaAerea> lista = (ArrayList<LineaAerea>) objInput.readObject();
			this.fileIn.close();
			this.objInput.close();
			return lista;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void saveAllLineaAerea(List<LineaAerea> lineaAerea) throws FileNotFoundException, IOException {
		this.file= new File(PropertiesUtil.getPathLineaAerea(),PropertiesUtil.getNameLineaAerea());
		this.fileOut = new FileOutputStream(file);
		this.objOutput = new ObjectOutputStream(fileOut);
		this.objOutput.writeObject(lineaAerea);
		this.objOutput.close();

	}

}
