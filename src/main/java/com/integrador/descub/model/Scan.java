package com.integrador.descub.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;

@Entity
@Table(name="descub_scan")
public class Scan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;


	@ManyToOne
    @JoinColumn(name = "id_mural_id")
    private Mural mural;

	@ManyToOne
    @JoinColumn(name = "id_usuario_id")
    private Usuario usuario;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro")
	private Date fecha_registro;



	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id_scan) {
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

	@JsonIgnore
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}