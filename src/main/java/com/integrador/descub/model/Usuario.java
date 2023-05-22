package com.integrador.descub.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name="usuario")
public class Usuario  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre",length = 100)
	private String nombre;
	
	@Column(name = "apellidos",length = 200)
	private String apellidos;

	@Column(name = "usuario",length = 50)
	private String usuario;

	@Column(name = "email",length = 250)
	private String email;
	
	@Column(name = "contrasena",length = 60)
	private String contrasena;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro")
	private Date fecha_registro;

	//GET Y SETT
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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