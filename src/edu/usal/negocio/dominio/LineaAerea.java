package edu.usal.negocio.dominio;

import java.io.Serializable;

public class LineaAerea implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 664L;
	private String nombre;
	private int alianza;
	private Vuelo vuelos;
	
	LineaAerea(){
		Vuelo vuelos = new Vuelo();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAlianza() {
		return alianza;
	}
	public void setAlianza(int alianza) {
		this.alianza = alianza;
	}
	public Vuelo getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelo vuelos) {
		this.vuelos = vuelos;
	}
}
