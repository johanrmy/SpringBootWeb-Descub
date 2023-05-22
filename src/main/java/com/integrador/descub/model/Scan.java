package com.integrador.descub.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="scan")
public class Scan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "id_mural")
    private Mural mural;
	
	@ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro")
	private Date fecha_registro;

	//GET Y SET
	public Long getId() {
		return id;
	}

	public void setId(Long id_scan) {
		this.id = id;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}