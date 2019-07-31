package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String carMaker;

    @NotNull
    @Size(min=3)
    private String carModel;

    @NotNull
    @Min(1900)
    private int carYear;
    //@Size(min=4)
    //private String carYear;

    public Car(@NotNull @Size(min = 3) String carMaker, @NotNull @Size(min = 4) String carModel, @NotNull @Min(1900) int carYear) {
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public Car() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
