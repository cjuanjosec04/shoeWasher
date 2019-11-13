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
@Table(name="accion_tipo_usuario")
public class Accion_tipo_usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id_accion_tipo_usuario;
	
	@Column(name="id_accion")
	private String Id_accion;
	
	@Column(name="Id_tipo_usuario")
	private String Id_tipo_usuario;
	
	@Column(name="id_estado")
	private String Id_estado;
	
	@Column(name="created_at")
	@Temporal(TemporalType.DATE)
    private Calendar Created_At;
	
	@Column(name="updated_at")
	@Temporal(TemporalType.DATE)
    private Calendar Updated_At;
	
	public Accion_tipo_usuario() {
		super();
	}

	public Accion_tipo_usuario(long id_accion_tipo_usuario, String id_accion, String id_tipo_usuario, String id_estado,
			Calendar created_At, Calendar updated_At) {
		super();
		Id_accion_tipo_usuario = id_accion_tipo_usuario;
		Id_accion = id_accion;
		Id_tipo_usuario = id_tipo_usuario;
		Id_estado = id_estado;
		Created_At = created_At;
		Updated_At = updated_At;
	}

	public long getId_accion_tipo_usuario() {
		return Id_accion_tipo_usuario;
	}

	public void setId_accion_tipo_usuario(long id_accion_tipo_usuario) {
		Id_accion_tipo_usuario = id_accion_tipo_usuario;
	}

	public String getId_accion() {
		return Id_accion;
	}

	public void setId_accion(String id_accion) {
		Id_accion = id_accion;
	}

	public String getId_tipo_usuario() {
		return Id_tipo_usuario;
	}

	public void setId_tipo_usuario(String id_tipo_usuario) {
		Id_tipo_usuario = id_tipo_usuario;
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
