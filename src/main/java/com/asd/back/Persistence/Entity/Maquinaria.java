package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "maquinaria")
public class Maquinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombremaquinaria")
    private String nombreMaquinaria;
    private String dimensiones;
    private String descripcion;
    private String serial;
    @Column(name = "numerointernoinventario")
    private String numeroInternoInventario;
    private Integer valor;
    @Column(name = "fechacompra")
    private Date fechaCompra;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreMaquinaria() {return nombreMaquinaria;}
    public void setNombreMaquinaria(String nombreMaquinaria) {this.nombreMaquinaria = nombreMaquinaria;}

    public String getDimensiones() {return dimensiones;}
    public void setDimensiones(String dimensiones) {this.dimensiones = dimensiones;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getSerial() {return serial;}
    public void setSerial(String serial) {this.serial = serial;}

    public String getNumeroInternoInventario() {return numeroInternoInventario;}
    public void setNumeroInternoInventario(String numeroInternoInventario) {this.numeroInternoInventario = numeroInternoInventario;}

    public Integer getValor() {return valor;}
    public void setValor(Integer valor) {this.valor = valor;}

    public Date getFechaCompra() {return fechaCompra;}
    public void setFechaCompra(Date fechaCompra) {this.fechaCompra = fechaCompra;}
}
