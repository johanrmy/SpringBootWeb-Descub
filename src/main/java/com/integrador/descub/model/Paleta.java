package com.integrador.descub.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;

@Entity
@Table(name="paleta")
public class Paleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	    
	@ManyToOne
	@JoinColumn(name = "id_mural")
	private Mural mural;

	@ManyToOne
	@JoinColumn(name = "id_color")
	private Color color;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}