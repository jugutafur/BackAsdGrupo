package com.asd.back.Domain;

import javax.persistence.Column;
import java.util.Date;

public class Machine {
    private int id;
    private String nameMachine;
    private String dimensions;
    private String description;
    private String serie;
    private String nameInsideInventory;
    private int value;
    private Date dataPurchuse;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNameMachine() {return nameMachine;}
    public void setNameMachine(String nameMachine) {this.nameMachine = nameMachine;}

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
