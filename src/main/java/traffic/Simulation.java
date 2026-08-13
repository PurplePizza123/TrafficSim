package main.java.traffic;

public class Simulation {
    private Vehicle vehicle;

    public Simulation(Vehicle vehicle) {
        this.vehicle = vehicle;
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