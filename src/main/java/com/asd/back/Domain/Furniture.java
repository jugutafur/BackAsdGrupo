package com.asd.back.Domain;

import java.util.Date;

public class Furniture {private int id;
    private String nameFurniture;
    private String dimensions;
    private String description;
    private String serie;
    private String nameInsideInventory;
    private int value;
    private Date dataPurchuse;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNameFurniture() {return nameFurniture;}
    public void setNameFurniture(String nameFurniture) {this.nameFurniture = nameFurniture;}

    public String getDimensions() {return dimensions;}
    public void setDimensions(String dimensions) {this.dimensions = dimensions;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getSerie() {return serie;}
    public void setSerie(String serie) {this.serie = serie;}

    public String getNameInsideInventory() {return nameInsideInventory;}
    public void setNameInsideInventory(String nameInsideInventory) {this.nameInsideInventory = nameInsideInventory;}

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}

    public Date getDataPurchuse() {return dataPurchuse;}
    public void setDataPurchuse(Date dataPurchuse) {this.dataPurchuse = dataPurchuse;}
}