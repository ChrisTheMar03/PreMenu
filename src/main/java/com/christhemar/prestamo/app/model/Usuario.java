package com.christhemar.prestamo.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsu;
	private String nombre;
	private String apellidos;
	private String dni;
	private String correo;
	private String clave;
	private String telefono;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer idUsu, String nombre, String apellidos, String dni, String correo, String clave,
			String telefono) {
		super();
		this.idUsu = idUsu;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
		this.clave = clave;
		this.telefono = telefono;
	}

	public Integer getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(Integer idUsu) {
		this.idUsu = idUsu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
