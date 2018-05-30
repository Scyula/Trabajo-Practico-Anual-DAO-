package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 516L;
	private String nombre;
	private String apellido;
	private Pasaporte pasaporte;
	private String cuitcuil;
	private Calendar fechaNac;
	private String email;
	private Telefono telefono;
	private PasajeroFrecuente pasajeroFrecuente;
	private Direccion direccion;
	private List<Integer> vuelos;
	
	@SuppressWarnings("unused")
	public Cliente(){
		Pasaporte pasaporte= new Pasaporte();
		Calendar fechaNac = new GregorianCalendar();
		Telefono telefono = new Telefono();
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente();
		Direccion direccion = new Direccion();
		List<Integer> vuelos = new ArrayList<Integer>();
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
	public Calendar getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Calendar fechaNac) {
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
	public List<Integer> getVuelos() {
		return vuelos;
	}
	public void setVuelos(List<Integer> vuelos) {
		this.vuelos = vuelos;
	}
	
}
