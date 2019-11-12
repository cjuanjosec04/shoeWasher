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
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id_Usuario;
	
	@Column(name="nombres")
	private String Nombres;
	
	@Column(name="apellidos")
	private String Apellidos;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="direccion")
	private String Direccion;
	
	@Column(name="barrio")
	private String Barrio;
	
	@Column(name="contrasena")
	private String Contrasena;
	
	@Column(name="id_estado")
	private long Id_Estado;
	
	@Column(name="id_depto")
	private long Id_Depto;
	
	@Column(name="id_ciudad")
	private long Id_Ciudad;
	
	@Column(name="created_at")
	@Temporal(TemporalType.DATE)
    private Calendar Created_At;
	
	@Column(name="updated_at")
	@Temporal(TemporalType.DATE)
    private Calendar Updated_At;

	public Usuario() {
		super();
	}

	public Usuario(String nombres, String apellidos, String email, String direccion, String barrio, String contrasena,
			long id_Estado, long id_Depto, long id_Ciudad) {
		super();
		Nombres = nombres;
		Apellidos = apellidos;
		Email = email;
		Direccion = direccion;
		Barrio = barrio;
		Contrasena = contrasena;
		Id_Estado = id_Estado;
		Id_Depto = id_Depto;
		Id_Ciudad = id_Ciudad;
	}

	public long getId_Usuario() {
		return Id_Usuario;
	}

	public void setId_Usuario(long id_Usuario) {
		Id_Usuario = id_Usuario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getBarrio() {
		return Barrio;
	}

	public void setBarrio(String barrio) {
		Barrio = barrio;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public long getId_Estado() {
		return Id_Estado;
	}

	public void setId_Estado(long id_Estado) {
		Id_Estado = id_Estado;
	}

	public long getId_Depto() {
		return Id_Depto;
	}

	public void setId_Depto(long id_Depto) {
		Id_Depto = id_Depto;
	}

	public long getId_Ciudad() {
		return Id_Ciudad;
	}

	public void setId_Ciudad(long id_Ciudad) {
		Id_Ciudad = id_Ciudad;
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
