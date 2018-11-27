package com.okan.plantplaces.service;

import com.okan.plantplaces.dao.ISpecimanDAO;
import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.model.Specimen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SpecimenServiceStub implements ISpecimenService {

    private ISpecimanDAO specimanDAO;

    @Override
    public Specimen findById(int id){

        Specimen specimen = new Specimen();
        specimen.setSpecimenId(43);
        return specimen;
    }

    @Override
    public boolean save(Specimen specimen) throws Exception{

       boolean result=specimanDAO.save(specimen);
       return result;
    }

    @Override
    public List<Plant> fetchPlants(String s) {
        List<Plant> matchingPlants = new ArrayList<Plant>();

        if(s.contains("Eastern Redbud") || s.contains("Cercis")){

            Plant plant = new Plant();
            plant.setGenus("Cercis");
            plant.setSpecies("canadencis");
            plant.setCommon("Eastern Redbud");
            matchingPlants.add(plant);

        }
        return matchingPlants;
    }

    @Override
    public void setSpecimanDAO(ISpecimanDAO specimanDAO) {
        this.specimanDAO = specimanDAO;
    }

    @Override
    public ISpecimanDAO getSpecimanDAO() {
        return specimanDAO;
    }
}
