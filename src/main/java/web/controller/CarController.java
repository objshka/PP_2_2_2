package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;
@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
