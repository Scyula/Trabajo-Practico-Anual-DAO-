package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Venta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 837L;
	private int id_venta;
	private String cliente;
	private int id_vuelo;
	private String lineaAerea;
	private Calendar fechaHoraVenta;
	private String formaPago;
	private String totalPagar;
	
	public Venta(){
		Cliente cliente = new Cliente();
		Vuelo vuelo = new Vuelo();
		Calendar fechaHoraVenta = new GregorianCalendar();
	}
	
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getVuelo() {
		return id_vuelo;
	}
	public void setVuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public String getLineaAerea() {
		return lineaAerea;
	}
	public void setLineaAerea(String lineaAerea) {
		this.lineaAerea = lineaAerea;
	}
	public Calendar getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Calendar fechaHoraVenta) {
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
