package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Mueble;
import org.springframework.data.repository.CrudRepository;

public interface MuebleCRUDRepository extends CrudRepository<Mueble, Integer> {
}
