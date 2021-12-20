package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Activo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActivoCRUDRepository extends CrudRepository<Activo, Integer> {
    //List<Activo> findByType(String type);
}
