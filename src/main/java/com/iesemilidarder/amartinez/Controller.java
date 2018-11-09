package com.iesemilidarder.amartinez;

import com.iesemilidarder.amartinez.data.Flight;
import com.iesemilidarder.amartinez.data.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping ("/Flight")
    public Product getFlight (@RequestParam (value="name", defaultValue ="Vuela muy alto") String name){
        Flight flight= new Flight();
        flight.setName(name);
        return flight;
    }
}
