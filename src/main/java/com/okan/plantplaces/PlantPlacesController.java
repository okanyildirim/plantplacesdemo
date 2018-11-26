package com.okan.plantplaces;

import com.okan.plantplaces.model.Specimen;
import com.okan.plantplaces.service.ISpecimenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlantPlacesController {

    @Autowired
    private ISpecimenService specimenServiceStub;

    @RequestMapping(value = "/start")
    public String start(){
        return "start";
    }

    @RequestMapping(value = "/start",method = RequestMethod.GET)
    public String read(Model model){

        Specimen specimen = specimenServiceStub.findById(43);
        model.addAttribute("specimen",specimen);
        return "start";
    }

    @RequestMapping(value = "/addspecimen",method = RequestMethod.GET)
    public String addSpecimen(Model model, @RequestParam(value = "latitude",required = false,defaultValue = "0.0") String latitude){
        Specimen specimen = specimenServiceStub.findById(43);
        specimen.setLatitude(latitude);
        model.addAttribute("specimen",specimen);
        return "start";
    }

    @RequestMapping(value = "/start",method = RequestMethod.GET, headers = {"content-type=text/json"}, params = "")
    public String readJSON(){

        return "start";
    }

    @RequestMapping(value = "/start",method = RequestMethod.GET,  params = {"loyalty=blue"})
    public ModelAndView readBlue(){

        Specimen specimen = specimenServiceStub.findById(43);
        specimen.setSpecimenId(98);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("start");
        modelAndView.addObject("specimen",specimen);

        return modelAndView;
    }
}
