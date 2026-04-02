package com.paulsproduct.heat_seasons_api.Service;

import com.paulsproduct.heat_seasons_api.model.Car;
import com.paulsproduct.heat_seasons_api.repository.CarRepository;

import java.util.List;

public class CarService
{
    private final CarRepository _carRepo;

    public CarService(CarRepository carRepo)
    {
        _carRepo = carRepo;
    }

    public List<Car> getAllCars()
    {
        return _carRepo.getAllCars();
    }
}
