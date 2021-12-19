package com.asd.back.Domain.Service;

import com.asd.back.Domain.Furniture;
import com.asd.back.Domain.Repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FurnitureService {

    @Autowired
    private FurnitureRepository furnitureRepository;

    public List<Furniture> getAllFurniture(){
        return furnitureRepository.getAllFurniture();}

    public Optional<Furniture> getFurniture(int id){
        return furnitureRepository.getFurniture(id);}

    public Furniture saveFurniture(Furniture furniture){
        return furnitureRepository.saveFurniture(furniture);}

    public boolean deleteFurniture(int furnitureId){
        return getFurniture(furnitureId).map(furniture ->{
            furnitureRepository.deleteFurniture(furnitureId);
            return true;
        }).orElse(false);
    }
}
