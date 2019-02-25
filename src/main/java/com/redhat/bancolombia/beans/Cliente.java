package com.redhat.bancolombia.beans;

public class Cliente {
	
	String cedula;
	String fecha;
	String tipoTx;
	Double valor;
	
	public Cliente(String cedula, String fecha, String tipoTx, Double valor) {
		super();
		this.cedula = cedula;
		this.fecha = fecha;
		this.tipoTx = tipoTx;
		this.valor = valor;
	}
	public Cliente() {
		super();
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipoTx() {
		return tipoTx;
	}
	public void setTipoTx(String tipoTx) {
		this.tipoTx = tipoTx;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
