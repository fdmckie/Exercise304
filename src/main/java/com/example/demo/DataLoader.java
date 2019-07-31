package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car("Nissan", "Sentra", 2018);
        repository.save(car);

        car = new Car("Ford", "Mustang", 2016);
        repository.save(car);

        car = new Car("Dodge", "Ram", 2015);
        repository.save(car);
    }
}
