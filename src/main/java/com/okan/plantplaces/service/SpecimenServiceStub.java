package com.okan.plantplaces.service;

import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.model.Specimen;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SpecimenServiceStub implements ISpecimenService {

    @Override
    public Specimen findById(int id){

        Specimen specimen = new Specimen();
        specimen.setSpecimenId(43);
        return specimen;
    }

    @Override
    public void save(Specimen specimen){


    }

    @Override
    public List<Plant> fetchPlants(String s) {
        List<Plant> matchingPlants = new ArrayList<Plant>();

        if(s.contains("edbub") || s.contains("Cercis")){

            Plant plant = new Plant();
            plant.setGenus("Cercis");
            plant.setSpecies("canadencis");
            plant.setCommon("Eastern Redbud");
            matchingPlants.add(plant);

        }
        return matchingPlants;
    }
}
