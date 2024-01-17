

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
    this.fuel = fuel;
    this.fuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f);
    this.passengers = passengers;
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers){
        float adjustedFuelUsage = fuelUsage + (fuelUsage * passengers * 0.05f);
        return fuel / adjustedFuelUsage * 100;
    }

    public float maxDistance() {
    return fuel / fuelUsage * 100;
    }

    public float getFuel() {
        return fuel;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

