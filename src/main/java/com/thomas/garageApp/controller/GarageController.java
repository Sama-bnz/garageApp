package com.thomas.garageApp.controller;

import com.thomas.garageApp.model.Car;
import com.thomas.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;

    @RequestMapping(method = RequestMethod.GET, value= "/cars")
    public List<Car> getCars() {
        return garageService.getCars();
    }

    @RequestMapping(method = RequestMethod.GET, value="/car/{id}")
    public Car getCard(@PathVariable long id) {
        return garageService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/car/{id}")
    public void deleteCar(@PathVariable long id) {
        garageService.deleteCar(id);
    }
    @RequestMapping(method = RequestMethod.POST, value="/cars")
    public void addCar(@RequestBody Car car) {
        garageService.addCar(car);
    }
    @RequestMapping(method = RequestMethod.PUT, value ="/car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable long id) {
        garageService.updateCar(car, id);
    }

}
