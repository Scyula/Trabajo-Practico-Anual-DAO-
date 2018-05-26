package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 837L;
	private int id_venta;
	private Cliente cliente;
	private Vuelo vuelo;
	private String lineaAerea;
	private Date fechaHoraVenta;
	private String formaPago;
	private String totalPagar;
	
	Venta(){
		Cliente cliente = new Cliente();
		Vuelo vuelo = new Vuelo();
		Date fechaHoraVenta = new Date();
	}
	
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public String getLineaAerea() {
		return lineaAerea;
	}
	public void setLineaAerea(String lineaAerea) {
		this.lineaAerea = lineaAerea;
	}
	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public String getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(String totalPagar) {
		this.totalPagar = totalPagar;
	}
	
}
