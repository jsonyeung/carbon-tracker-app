package com.as3.parmjohal.carbontracker;

/**
 * Created by ParmJohal on 2017-03-01.
 */

public class Car {

    //make	model	year	trany	cylinders	displ	fuelType	city08	highway08

    private String make = "";
    private String model = "";
    private String fuelType = "";
    private String tranyType = "";
    private String name = " ";

    private int year = 0;
    private int numCylinders = 0;
    private int highwayFuel = 0;
    private int cityFuel = 0;

    private double engineDisplacment = 0;

    public Car() {
    }

    public Car(String name, String make, String model, int year, String tranyType, double engineDisplacment) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.tranyType = tranyType;
        this.engineDisplacment = engineDisplacment;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTranyType() {
        return tranyType;
    }

    public void setTranyType(String tranyType) {
        this.tranyType = tranyType;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public double getEngineDisplacment() {
        return engineDisplacment;
    }

    public void setEngineDisplacment(double engineDisplacment) {
        this.engineDisplacment = engineDisplacment;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHighwayFuel() {
        return highwayFuel;
    }

    public void setHighwayFuel(int highwayFuel) {
        this.highwayFuel = highwayFuel;
    }

    public int getCityFuel() {
        return cityFuel;
    }

    public void setCityFuel(int cityFuel) {
        this.cityFuel = cityFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", tranyType='" + tranyType + '\'' +
                ", numCylinders=" + numCylinders +
                ", engineDisplacment=" + engineDisplacment +
                ", fuelType='" + fuelType + '\'' +
                ", highwayFuel=" + highwayFuel +
                ", cityFuel=" + cityFuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.engineDisplacment, engineDisplacment) != 0) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return tranyType != null ? tranyType.equals(car.tranyType) : car.tranyType == null;

    }
}
