package com.okan.plantplaces.service;

import com.okan.plantplaces.model.Specimen;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub implements ISpecimenServiceStub {

    @Override
    public Specimen findById(int id){

        Specimen specimen = new Specimen();
        specimen.setSpecimenId(43);
        return specimen;
    }

    @Override
    public void save(Specimen specimen){


    }
}
