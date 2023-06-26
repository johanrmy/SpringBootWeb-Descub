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
    private BigDecimal latitud;
    
    @Column(name = "altitud", precision = 10, scale = 8)
    private BigDecimal altitud;

	@Column(name = "foto1",columnDefinition="LONGBLOB")
	private byte[] foto1;

	@Column(name = "foto2",columnDefinition="LONGBLOB")
	private byte[] foto2;

	@Column(name = "foto3",columnDefinition="LONGBLOB")
	private byte[] foto3;

	@Column(name = "foto4",columnDefinition="LONGBLOB")
	private byte[] foto4;


    
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

	public byte[] getFoto1() {
		return foto1;
	}

	public void setFoto1(byte[] foto1) {
		this.foto1 = foto1;
	}

	public byte[] getFoto2() {
		return foto2;
	}

	public void setFoto2(byte[] foto2) {
		this.foto2 = foto2;
	}

	public byte[] getFoto3() {
		return foto3;
	}

	public void setFoto3(byte[] foto3) {
		this.foto3 = foto3;
	}

	public byte[] getFoto4() {
		return foto4;
	}

	public void setFoto4(byte[] foto4) {
		this.foto4 = foto4;
	}
}