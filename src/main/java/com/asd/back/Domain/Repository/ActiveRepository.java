package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Active;

import java.util.List;
import java.util.Optional;

public interface ActiveRepository {

    List<Active> getAllActive();
    Optional<Active> getActive(int id);
    Active saveActive(Active active);
    void deleteActive(int activeId);
    String getActiveByType(String type);
}
