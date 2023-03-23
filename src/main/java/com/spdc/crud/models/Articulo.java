package com.spdc.crud.models;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "articulos")
public class Articulo {

    //1. Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Long contenido;
    private Date fechaCreacion;
    private Long idCategoria;

    //2. Constructores

    public Articulo(){

    }

    public Articulo(Long id, String titulo, Long contenido, Date fechaCreacion, Long idCategoria) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.idCategoria = idCategoria;
    }

    //3. Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getContenido() {
        return contenido;
    }

    public void setContenido(Long contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
}
