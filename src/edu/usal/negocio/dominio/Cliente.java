package edu.usal.negocio.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	private String nombre;
	private String apellido;
	private Pasaporte pasaporte;
	private String cuitcuil;
	private Date fechaNac;
	private String email;
	private Telefono telefono;
	private PasajeroFrecuente pasajeroFrecuente;
	private Direccion direccion;
	private List<Vuelo> vuelos;
	
	Cliente(){
		Pasaporte pasaporte= new Pasaporte();
		Date fechaNac = new Date();
		Telefono telefono = new Telefono();
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente();
		Direccion direccion = new Direccion();
		List<Vuelo> vuelos = new ArrayList<Vuelo>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Pasaporte getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getCuitcuil() {
		return cuitcuil;
	}
	public void setCuitcuil(String cuitcuil) {
		this.cuitcuil = cuitcuil;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public PasajeroFrecuente getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}
	public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Vuelo> getVuelos() {
		return vuelos;
	}
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
}
