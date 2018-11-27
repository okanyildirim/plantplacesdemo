package com.okan.plantplaces.service;

import com.okan.plantplaces.dao.ISpecimanDAO;
import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.model.Specimen;

import java.util.List;

public interface ISpecimenService {
    Specimen findById(int id);

    boolean save(Specimen specimen) throws Exception;

    List<Plant> fetchPlants(String s);

    void setSpecimanDAO(ISpecimanDAO specimanDAO);

    ISpecimanDAO getSpecimanDAO();
}
