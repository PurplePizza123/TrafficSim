package main.java.traffic;

import static main.java.traffic.CarType.CIVIC;
import static main.java.traffic.CarType.F150;

public class Simulation {
    private Vehicle vehicle;

    public Simulation(Vehicle vehicle) {
        this.vehicle = vehicle;

        Vehicle car1 = new Vehicle(CIVIC);
        Vehicle car2 = new Vehicle(CIVIC);
        Vehicle car3 = new Vehicle(F150);
    }

    public void update(double deltaTime) {
        double acceleration = Physics.calculateAcceleration(vehicle);

        vehicle.setAcceleration(acceleration);

        vehicle.updateVelocity(deltaTime);
        vehicle.updatePosition(deltaTime);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}