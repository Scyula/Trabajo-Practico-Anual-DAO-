package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 196L;
	private int id_vuelo;
	private String nombreAerolinea;
	private Integer cantAsientos;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	private Date fechaHoraSalida;
	private Date fechaHoraLlegada;
	private String tiempoVuelo;
	private List<Cliente> clientes;
	
	Vuelo(){
		Aeropuerto aeropuertoSalida = new Aeropuerto();
		Aeropuerto aeropuertoLlegada= new Aeropuerto();
		Date fechaHoraSalida = new Date();
		Date fechaHoraLlegada= new Date();
		List<Cliente> clientes = new ArrayList<Cliente>();
	}
	
	public int getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	public void setNombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}
	public Integer getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(Integer cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}
	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Date getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}
	public void setFechaHoraLlegada(Date fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
	}
	public String getTiempoVuelo() {
		return tiempoVuelo;
	}
	public void setTiempoVuelo(String tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
