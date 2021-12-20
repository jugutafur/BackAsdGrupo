package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name= "activo")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;
    private String ciudad;/*
    @Column(name = "nombreresponsable")
    private String nombreResponsable;
    @Column(name = "identificacionresponsable")
    private Integer identificacionResponsable;
    @Column(name = "cargoresponsable")
    private String cargoResponsable;
    @Column(name = "nombreactivo")
    private String nombreActivo;
    @Column(name = "descripcionactivo")
    private String descripcionActivo;
    @Column(name = "dimensionesactivo")
    private String dimensionesActivo;
    @Column(name = "serialactivo")
    private String serialActivo;
    @Column(name = "numerointernoinventarioactivo")
    private String numeroInternoInventarioActivo;
    @Column(name = "valoractivo")
    private Integer valorActivo;
    @Column(name = "fechacompra")
    private Date fechaCompra;
*/

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
/*
    public String getNombreResponsable() {return nombreResponsable;}
    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;}

    public Integer getIdentificacionResponsable() {return identificacionResponsable;}
    public void setIdentificacionResponsable(Integer identificacionResponsable) {this.identificacionResponsable = identificacionResponsable;}

    public String getCargoResponsable() {return cargoResponsable;}
    public void setCargoResponsable(String cargoResponsable) {this.cargoResponsable = cargoResponsable;}

    public String getNombreActivo() {return nombreActivo;}
    public void setNombreActivo(String nombreActivo) {this.nombreActivo = nombreActivo;}

    public String getDescripcionActivo() {return descripcionActivo;}
    public void setDescripcionActivo(String descripcionActivo) {this.descripcionActivo = descripcionActivo;}

    public String getDimensionesActivo() {return dimensionesActivo;}
    public void setDimensionesActivo(String dimensionesActivo) {this.dimensionesActivo = dimensionesActivo;}

    public String getSerialActivo() {return serialActivo;}
    public void setSerialActivo(String serialActivo) {this.serialActivo = serialActivo;}

    public String getNumeroInternoInventarioActivo() {return numeroInternoInventarioActivo;}
    public void setNumeroInternoInventarioActivo(String numeroInternoInventarioActivo) {
        this.numeroInternoInventarioActivo = numeroInternoInventarioActivo;}

    public Integer getValorActivo() {return valorActivo;}
    public void setValorActivo(Integer valorActivo) {this.valorActivo = valorActivo;}

    public Date getFechaCompra() {return fechaCompra;}
    public void setFechaCompra(Date fechaCompra) {this.fechaCompra = fechaCompra;}
    */
}
