package com.okan.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {

    @RequestMapping(value = "/start")
    public String start(){
        return "Start";
    }
}
