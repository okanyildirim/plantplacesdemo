package com.okan.plantplaces.service;

import com.okan.plantplaces.model.Specimen;

public interface ISpecimenServiceStub {
    Specimen findById(int id);

    void save(Specimen specimen);
}
