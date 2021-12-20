package com.asd.back.Persistence;

import com.asd.back.Domain.Active;
import com.asd.back.Domain.Repository.ActiveRepository;
import com.asd.back.Persistence.CRUD.ActivoCRUDRepository;
import com.asd.back.Persistence.Entity.Activo;
import com.asd.back.Persistence.Mapper.ActiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ActivoRepository implements ActiveRepository {

    @Autowired
    private ActivoCRUDRepository activoCRUDRepository;

    @Autowired
    private ActiveMapper activeMapper;

    @Override
    public List<Active> getAllActive() {
        List<Activo> activos = (List<Activo>) activoCRUDRepository.findAll();
        return activeMapper.toListActive(activos);
    }

    @Override
    public Optional<Active> getActive(int id) {
        return activoCRUDRepository.findById(id).map(Active -> activeMapper.toActive(Active));
    }

    @Override
    public Active saveActive(Active active) {
        Activo activo = activeMapper.toActivo(active);
        return activeMapper.toActive(activoCRUDRepository.save(activo));
    }

    @Override
    public void deleteActive(int activeId) {activoCRUDRepository.deleteById(activeId);
    }

    @Override
    public String getActiveByType(String type) {
        return  "Este es el tipo "+ type;
    }
}
