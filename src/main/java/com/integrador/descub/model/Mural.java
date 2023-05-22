package com.integrador.descub.model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.*;

@Entity
@Table(name="mural")
public class Mural {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Mural")
    private int id_Mural;
    
    @Column(name = "nombre_mural")
    private String nombre_mural;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "id_muralista")
    private Muralista muralista;
    
    @Column(name = "latitud")
    private int latidud;
    
    @Column(name = "altitud")
    private int altidud;
    
    // GET Y SET
	public int getId_Mural() {
		return id_Mural;
	}
	public void setId_Mural(int id_Mural) {
		this.id_Mural = id_Mural;
	}
	public String getNombre_mural() {
		return nombre_mural;
	}
	public void setNombre_mural(String nombre_mural) {
		this.nombre_mural = nombre_mural;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Muralista getMuralista() {
		return muralista;
	}
	public void setMuralista(Muralista muralista) {
		this.muralista = muralista;
	}
	public int getLatidud() {
		return latidud;
	}
	public void setLatidud(int latidud) {
		this.latidud = latidud;
	}
	public int getAltidud() {
		return altidud;
	}
	public void setAltidud(int altidud) {
		this.altidud = altidud;
	}
  
}