package com.washer.shoeWasher.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="accion")
public class Accion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id_Accion;
	
	@Column(name="descripcion")
	private String Descripcion;
	
	@Column(name="ruta")
	private String Ruta;
	
	@Column(name="id_estado")
	private String Id_estado;
	
	@Column(name="created_at")
	@Temporal(TemporalType.DATE)
    private Calendar Created_At;
	
	@Column(name="updated_at")
	@Temporal(TemporalType.DATE)
    private Calendar Updated_At;
	
	public Accion() {
		super();
	}

	public Accion(long id_Accion, String descripcion, String ruta, String id_estado, Calendar created_At,
			Calendar updated_At) {
		super();
		Id_Accion = id_Accion;
		Descripcion = descripcion;
		Ruta = ruta;
		Id_estado = id_estado;
		Created_At = created_At;
		Updated_At = updated_At;
	}

	public long getId_Accion() {
		return Id_Accion;
	}

	public void setId_Accion(long id_Accion) {
		Id_Accion = id_Accion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getRuta() {
		return Ruta;
	}

	public void setRuta(String ruta) {
		Ruta = ruta;
	}

	public String getId_estado() {
		return Id_estado;
	}

	public void setId_estado(String id_estado) {
		Id_estado = id_estado;
	}

	public Calendar getCreated_At() {
		return Created_At;
	}

	public void setCreated_At(Calendar created_At) {
		Created_At = created_At;
	}

	public Calendar getUpdated_At() {
		return Updated_At;
	}

	public void setUpdated_At(Calendar updated_At) {
		Updated_At = updated_At;
	}

	
}
