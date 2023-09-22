package com.agenda.parroquia.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Parroquia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String direccion;
	private String telefono;
	@Column(name="fecha_estreno")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechacaInicio;
	public Parroquia() {
	
	}
	public Parroquia(Integer id, String nombre, String direccion, String telefono, Date fechacaInicio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechacaInicio = fechacaInicio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechacaInicio() {
		return fechacaInicio;
	}
	public void setFechacaInicio(Date fechacaInicio) {
		this.fechacaInicio = fechacaInicio;
	}


}
