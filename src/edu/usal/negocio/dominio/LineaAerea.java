package edu.usal.negocio.dominio;

public class LineaAerea {
	private String nombre;
	private int alianza;
	private Vuelo vuelos;
	
	
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
