package edu.usal.negocio.dominio;

import java.util.Date;

public class Pasaporte {
	private String nroPasaporte;
	private int pais;
	private String autoridademision;
	private Date emision;
	private Date vencimiento;
	
	
	public String getNroPasaporte() {
		return nroPasaporte;
	}
	public void setNroPasaporte(String nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public String getAutoridademision() {
		return autoridademision;
	}
	public void setAutoridademision(String autoridademision) {
		this.autoridademision = autoridademision;
	}
	public Date getEmision() {
		return emision;
	}
	public void setEmision(Date emision) {
		this.emision = emision;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	
}
