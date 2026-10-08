package main.java.traffic;

public class Physics {
    public static double calculateNetForce(Vehicle vehicle) {
        return vehicle.getEngineForce() - vehicle.getBrakeForce();
    }

    public static double calculateAcceleration(Vehicle vehicle, CarType type) {
        double netForce = calculateNetForce(vehicle);

        return netForce / type.getMass();
    }
}
