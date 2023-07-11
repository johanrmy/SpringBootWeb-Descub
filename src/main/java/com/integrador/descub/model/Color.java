package com.integrador.descub.model;

import jakarta.persistence.*;

@Entity
@Table(name="descub_color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre",length = 200)
    private String nombre;

    @Column(name = "codigo",length = 7)
    private String codigo;

    @Column(name = "red",length = 3)
    private String red;

    @Column(name = "blue",length = 3)
    private String blue;

    @Column(name = "green",length = 3)
    private String green;

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
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getRed() {
        return red;
    }
    public void setRed(String red) {
        this.red = red;
    }
    public String getBlue() {
        return blue;
    }
    public void setBlue(String blue) {
        this.blue = blue;
    }
    public String getGreen() {
        return green;
    }
    public void setGreen(String green) {
        this.green = green;
    }

}