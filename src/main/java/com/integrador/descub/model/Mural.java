package com.integrador.descub.model;

import java.math.BigDecimal;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name="mural")
public class Mural {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre",length = 200)
    private String nombre;
    
    @Column(name = "direccion",length = 200)
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;
    
    @Lob
    @Column(name = "imagen",columnDefinition="LONGBLOB")
    private byte[] imagen;
    
    @Column(name = "descripcion",length = 200)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_muralista")
    private Muralista muralista;
    
    @Column(name = "latitud", precision = 10, scale = 8)
    private BigDecimal latidud;
    
    @Column(name = "altitud", precision = 10, scale = 8)
    private BigDecimal altidud;
    
    // GET Y SET
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
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
	public BigDecimal getLatidud() {
		return latidud;
	}
	public void setLatidud(BigDecimal latidud) {
		this.latidud = latidud;
	}
	public BigDecimal getAltidud() {
		return altidud;
	}
	public void setAltidud(BigDecimal altidud) {
		this.altidud = altidud;
	}
  
}