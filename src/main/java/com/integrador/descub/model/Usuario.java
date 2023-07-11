package com.integrador.descub.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name="descub_usuario")
public class Usuario  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre",length = 100)
	private String nombre;
	
	@Column(name = "apellidos",length = 200)
	private String apellidos;

	@Column(name = "email",length = 250)
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro")
	private Date fecha_registro;

	//GET Y SETT

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

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
}