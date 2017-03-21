package com.as3.parmjohal.carbontracker.Model;

/**
 * Created by ParmJohal on 2017-03-17.
 */

public class Bus extends Transportation{

    private String name = " ";
    private int distance = 0;
    private Route busRoute;

    public Bus(String name, int distance) {
        super(0, 0, " ");
        this.name = name;
        this.distance = distance;
        setupSuperClass();
        busRoute = new Route(distance,0,"Bus Trip: "+name);

    }

    private void setupSuperClass() {
        super.setFuelType("Bus");
        super.setCityFuel(0.0087);
        super.setHighwayFuel(0);
    }
    public Route getRoute()
    {
        return busRoute;
    }


}