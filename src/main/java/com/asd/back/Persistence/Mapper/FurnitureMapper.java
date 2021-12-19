package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Furniture;
import com.asd.back.Domain.Machine;
import com.asd.back.Persistence.Entity.Maquinaria;
import com.asd.back.Persistence.Entity.Mueble;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FurnitureMapper {
    @Mappings({
            @Mapping(source = "nombreMueble", target = "nameFurniture"),
            @Mapping(source = "dimensiones", target = "dimensions"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "serial", target = "serie"),
            @Mapping(source = "numeroInternoInventario", target = "nameInsideInventory"),
            @Mapping(source = "valor", target = "value"),
            @Mapping(source = "fechaCompra", target = "dataPurchuse"),
    })
    Furniture toFurniture(Mueble mueble);
    List<Furniture> toListFurniture(List<Mueble> muebles);

    @InheritInverseConfiguration
    Mueble toMueble(Furniture furniture);
}
