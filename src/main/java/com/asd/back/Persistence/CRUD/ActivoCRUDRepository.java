package com.asd.back.Persistence.CRUD;

import com.asd.back.Domain.Active;
import com.asd.back.Persistence.Entity.Activo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ActivoCRUDRepository extends CrudRepository<Activo, Integer> {
    //Optional<List<Active>> findByType(int type);
}
