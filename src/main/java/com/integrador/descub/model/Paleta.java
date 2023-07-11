package com.integrador.descub.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;

@Entity
@Table(name="descub_paleta")
public class Paleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	    
	@ManyToOne
	@JoinColumn(name = "id_mural_id")
	private Mural mural;

	@ManyToOne
	@JoinColumn(name = "id_color_id")
	private Color color;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@JsonIgnore
	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

}