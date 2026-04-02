package com.paulsproduct.heat_seasons_api.Controller;

import com.paulsproduct.heat_seasons_api.Service.CarService;
import com.paulsproduct.heat_seasons_api.model.Car
        ;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController
{
    private final CarService _carService;

    public CarController(CarService carService)
    {
        _carService = carService;
    }

    @GetMapping("/greeting")
    public List<Car> allCars()
    {
        return _carService.getAllCars();
    }
}
