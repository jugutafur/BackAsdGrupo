package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Furniture;

import java.util.List;
import java.util.Optional;

public interface FurnitureRepository {
    List<Furniture> getAllFurniture();
    Optional<Furniture> getFurniture(int id);
    Furniture saveFurniture(Furniture furniture);
    void deleteFurniture(int furnitureId);
}
