package com.paulsproduct.heat_seasons_api.repository;

import com.paulsproduct.heat_seasons_api.model.Car;
import org.springframework.jdbc.core.simple.JdbcClient;

import java.util.List;

public class CarRepository
{
    private final JdbcClient _jdbcClient;

    public CarRepository(JdbcClient jdbcClient) {
        this._jdbcClient = jdbcClient;
    }

    public List<Car> getAllCars()
    {
        var result = _jdbcClient.sql("SELECT * FROM CARS").query(new Car.Mapper());
        return result.list();
    }
}
