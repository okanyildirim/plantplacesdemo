package com.okan.plantplaces.service;

import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.model.Specimen;

import java.util.List;

public interface ISpecimenService {
    Specimen findById(int id);

    void save(Specimen specimen);

    List<Plant> fetchPlants(String s);
}
