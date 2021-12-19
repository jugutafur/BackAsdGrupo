package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Machine;
import com.asd.back.Domain.Person;
import com.asd.back.Persistence.Entity.Maquinaria;
import com.asd.back.Persistence.Entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MachineMapper {

    @Mappings({
            @Mapping(source = "nombreMaquinaria", target = "nameMachine"),
            @Mapping(source = "dimensiones", target = "dimensions"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "serial", target = "serie"),
            @Mapping(source = "numeroInternoInventario", target = "nameInsideInventory"),
            @Mapping(source = "valor", target = "value"),
            @Mapping(source = "fechaCompra", target = "dataPurchuse"),
    })
    Machine toMachine(Maquinaria maquinaria);
    List<Machine> toListMachine(List<Maquinaria> maquinarias);

    @InheritInverseConfiguration
    Maquinaria toMaquinaria(Machine machine);
}
