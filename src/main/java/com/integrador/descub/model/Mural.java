package com.integrador.descub.model;

import java.math.BigDecimal;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name="descub_mural")
public class Mural {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nombre",length = 200)
    private String nombre;
    
    @Column(name = "direccion",length = 200)
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;
    
    @Lob
    @Column(name = "imagen1")
    private String imagen1;
	@Lob
	@Column(name = "imagen2")
	private String imagen2;
	@Lob
	@Column(name = "imagen3")
	private String imagen3;
    
    @Column(name = "descripcion",length = 200)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_muralista_id")
    private Muralista muralista;
    
    @Column(name = "latitud", precision = 10, scale = 8)
    private BigDecimal latitud;
    
    @Column(name = "altitud", precision = 10, scale = 8)
    private BigDecimal altitud;

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

	public String getImagen1() {
		return imagen1;
	}

	public void setImagen1(String imagen1) {
		this.imagen1 = imagen1;
	}

	public String getImagen2() {
		return imagen2;
	}

	public void setImagen2(String imagen2) {
		this.imagen2 = imagen2;
	}

	public String getImagen3() {
		return imagen3;
	}

	public void setImagen3(String imagen3) {
		this.imagen3 = imagen3;
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

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getAltitud() {
		return altitud;
	}

	public void setAltitud(BigDecimal altitud) {
		this.altitud = altitud;
	}
}