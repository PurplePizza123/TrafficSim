package main.java.traffic;

public enum CarType {

    CIVIC(1305, 0.3, 500, 50),
    F150(2500, 0.44, 750, 50);

    private final double mass;
    private final double dragCoefficient;
    private final double frontalArea;
    private final double maximumBrakingForce;

    CarType(double mass, double dragCoefficient, double frontalArea, double maximumBrakingForce) {
        this.dragCoefficient = dragCoefficient;
        this.frontalArea = frontalArea;
        this.maximumBrakingForce = maximumBrakingForce;
        this.mass = mass;
    }

    public double getMass() {
        return this.mass;
    }

    public double getDragCoefficient() {
        return this.dragCoefficient;
    }

    public double getFrontalArea() {
        return this.frontalArea;
    }

    public double getMaximumBrakingForce() {
        return this.maximumBrakingForce;
    }
}
