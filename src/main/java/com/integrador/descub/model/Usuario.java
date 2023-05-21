package com.integrador.descub.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Usuario")
public class Usuario  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario")
	private int id_Usuaio;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "email")
	private String email;
	
	@Column(name = "contraseña")
	private String contraseña;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fech_registro")
	private Date fecha_registro;
	
	@Column(name = "usuario")
	private String usuario;
	
	//GET Y SETT

	public int getId_Usuaio() {
		return id_Usuaio;
	}

	public void setId_Usuaio(int id_Usuaio) {
		this.id_Usuaio = id_Usuaio;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}