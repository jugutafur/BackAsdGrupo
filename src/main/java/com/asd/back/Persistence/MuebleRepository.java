package com.asd.back.Persistence;

import com.asd.back.Domain.Furniture;
import com.asd.back.Domain.Repository.FurnitureRepository;
import com.asd.back.Persistence.CRUD.MuebleCRUDRepository;
import com.asd.back.Persistence.Entity.Mueble;
import com.asd.back.Persistence.Mapper.FurnitureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MuebleRepository implements FurnitureRepository {

    @Autowired
    private MuebleCRUDRepository muebleCRUDRepository;

    @Autowired
    private FurnitureMapper furnitureMapper;

    @Override
    public List<Furniture> getAllFurniture() {
        List<Mueble> muebles = (List<Mueble>) muebleCRUDRepository.findAll();
        return furnitureMapper.toListFurniture(muebles);
    }

    @Override
    public Optional<Furniture> getFurniture(int id) {
        return muebleCRUDRepository.findById(id).map(Furniture -> furnitureMapper.toFurniture(Furniture));
    }

    @Override
    public Furniture saveFurniture(Furniture furniture) {
        Mueble mueble = furnitureMapper.toMueble(furniture);
        return furnitureMapper.toFurniture(muebleCRUDRepository.save(mueble));
    }

    @Override
    public void deleteFurniture(int furnitureId) {
        muebleCRUDRepository.deleteById(furnitureId);
    }
}
