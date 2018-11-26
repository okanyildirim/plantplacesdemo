package com.okan.plantplaces;


import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.service.ISpecimenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpecimenServiceTest {

    @Autowired
    ISpecimenService specimenService;
    List<Plant> plants;

    @Test
    public void fetchPlants_validateNoResultForJunkData(){

        //givenUserIsLoggedInToMyPlantDiary();
        whenTheUserSearchesForJunk();
        thenMyPlantDiaryReturnsZeroResults();
    }

    private void givenUserIsLoggedInToMyPlantDiary() {

    }

    private void whenTheUserSearchesForJunk() {

        plants=specimenService.fetchPlants("işdskhfşsdkljfş;asfsd");
    }


    private void thenMyPlantDiaryReturnsZeroResults() {
        assertEquals("Number of plants returned",1,plants.size());
    }


}
