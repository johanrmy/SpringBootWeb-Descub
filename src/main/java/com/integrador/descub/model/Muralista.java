package com.integrador.descub.model;

import jakarta.persistence.*;

@Entity
@Table(name="descub_muralista")
public class Muralista {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre",length = 100)
    private String nombre;
    @Column(name="apellidos",length = 200)
    private String apellidos;
    @Column(name = "seudonimo",length = 100)
    private String seudonimo;
    @Column(name = "foto")
    private String foto;
    @Column(name = "celular",length = 9)
    private String telefono;
    @Column(name = "user_instagram",length = 30)
    private String userInstagram;
    @Column(name = "user_facebook",length = 50)
    private String userFacebook;
    @Column(name = "email",length = 250)
    private String email;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUserInstagram() {
        return userInstagram;
    }

    public void setUserInstagram(String userInstagram) {
        this.userInstagram = userInstagram;
    }

    public String getUserFacebook() {
        return userFacebook;
    }

    public void setUserFacebook(String userFacebook) {
        this.userFacebook = userFacebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}