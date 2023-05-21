package com.integrador.descub.model;

import com.descub.model.Colores;
import com.descub.model.Mural;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="paleta")
public class Paleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Paleta")
	private int id_Paleta;
	    
	@ManyToOne
	@JoinColumn(name = "id_Mural")
	private Mural mural;

	@ManyToOne
	@JoinColumn(name = "id_Colores")
	private Colores colores;
	
	public int getId_Paleta() {
		return id_Paleta;
	}

	public void setId_Paleta(int id_Paleta) {
		this.id_Paleta = id_Paleta;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public Colores getColores() {
		return colores;
	}

	public void setColores(Colores colores) {
		this.colores = colores;
	}
	
	
	
 
}