package edu.usal.negocio.dominio;

import java.io.Serializable;

public class Aeropuerto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 333L;
	private String idAeropuerto;
	private String ciudad;
	private String provincia;
	private String pais;
	
	public String getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}