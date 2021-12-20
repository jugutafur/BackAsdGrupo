package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Active;
import com.asd.back.Persistence.Entity.Activo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActiveMapper {

    @Mappings({
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "ciudad", target = "city")/*
            @Mapping(source = "nombreResponsable", target = "nameResponsible"),
            @Mapping(source = "identificacionResponsable", target = "identificationResponsible"),
            @Mapping(source = "cargoResponsable", target = "positionResponsible"),
            @Mapping(source = "nombreActivo", target = "nameActive"),
            @Mapping(source = "descripcionActivo", target = "descriptionActive"),
            @Mapping(source = "dimensionesActivo", target = "dimensionsActive"),
            @Mapping(source = "serialActivo", target = "serieActive"),
            @Mapping(source = "numeroInternoInventarioActivo", target = "numberInsideInventoryActive"),
            @Mapping(source = "valorActivo", target = "valueActive"),
            @Mapping(source = "fechaCompra", target = "datePurchuse")*/
    })
    Active toActive(Activo activo);
    List<Active> toListActive(List<Activo> activos);

    @InheritInverseConfiguration
    Activo toActivo(Active active);
}
