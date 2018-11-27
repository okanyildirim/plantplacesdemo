package com.okan.plantplaces;


import com.okan.plantplaces.dao.ISpecimanDAO;
import com.okan.plantplaces.model.Plant;
import com.okan.plantplaces.model.Specimen;
import com.okan.plantplaces.service.ISpecimenService;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpecimenServiceTest {

    @Autowired
    ISpecimenService specimenService;
    List<Plant> plants;
    Specimen specimen ;

    @MockBean
    private ISpecimanDAO specimanDAO;

    @Before
    public  void  setup() throws Exception {

        Specimen specimen = new Specimen();
        specimen.setDescription("A beutiful Redbud I planted myself");
        specimen.setSpecimenId(83);

        Mockito.when(specimanDAO.save(specimen)).thenReturn(true);
        specimenService.setSpecimanDAO(specimanDAO);

    }

    @Test
    public  void saveSpecimen_whenRedbudEntered(){
        //givenUserIsLoggedInToMyPlantDiary();
        whenUserSearchesForEasternRedbud();
        whenUserAddsTextDetails();
        thenSpecimenisSaved();

    }

    private void whenUserSearchesForEasternRedbud() {

        plants=specimenService.fetchPlants("Eastern Redbud");
    }

    private void whenUserAddsTextDetails() {
        specimen=new Specimen();
        Plant plant = plants.get(0);
        specimen.setPlantId(plant.getGuid());
        specimen.setDescription("A beutiful Redbud I planted myself");
        specimen.setSpecimenId(83);
    }

    private void thenSpecimenisSaved() {
        try {
            boolean result = specimenService.save(specimen);
            assertTrue(result);
        }catch (Exception e){
            fail();
        }

    }

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
        assertEquals("Number of plants returned",0,plants.size());
    }

}
