/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class Car {
    private final double fuelEfficiency;
    private double currentDistance;
    private double currentFuel;

    public Car(double fuelEfficiency, double initialFuel) {
        this.fuelEfficiency = fuelEfficiency;
        this.currentDistance = 0.0;
        this.currentFuel = initialFuel;
    }

    public Car drive(double miles, double addedFuel) {
        double requiredFuel = miles / fuelEfficiency;
        if (requiredFuel > currentFuel) {
            throw new IllegalArgumentException("Not enough fuel to drive " + miles + " miles.");
        }
        currentFuel -= requiredFuel;
        currentFuel += addedFuel;
        currentDistance += miles;
        return this;
    }

    public double getCurrentDistance() {
        return currentDistance;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }
}