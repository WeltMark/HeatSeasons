package com.paulsproduct.heat_seasons_api.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class Car
{
    private Number _number;
    private String _colour;

    public String get_colour() { return _colour; }
    public Number get_number() { return _number; }

    public static class Mapper implements RowMapper<Car> {

        @Override
        public Car mapRow(ResultSet rs, int rowNum) throws SQLException
        {
            Car car = new Car();
            car._colour = rs.getString("COLOUR");
            car._number = rs.getInt("NUMBER");
            return car;
        }
    }
}