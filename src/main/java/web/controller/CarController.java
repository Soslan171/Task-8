package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.Service;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {
    @GetMapping(value = "/cars")
    public String Carlist(ModelMap module) {
        List<String> carmessages = new ArrayList<>();
        List<Car> messages = Service.getCar();
        carmessages.add("wroah!");
        module.addAttribute("carList", messages);
        return "cars";
    }
}





