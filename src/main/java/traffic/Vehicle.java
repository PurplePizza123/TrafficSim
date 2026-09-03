package main.java.traffic;
// TODO: Vehicle in its solidarity would mostly be the forces/physics that each individual vehicle is experiencing
public class Vehicle {

    private double position;
    private double velocity;
    private double acceleration;

    private double engineForce;
    private double brakeForce;

    private CarType type;

    public Vehicle(CarType type) {
       this.type = type;
    }

    public double getPosition() {
        return position;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getEngineForce() {
        return engineForce;
    }

    public double getBrakeForce() {
        return brakeForce;
    }

    public void setEngineForce(double force) {
        engineForce = force;
    }

    public void setBrakeForce(double force) {
        brakeForce = force;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void updateVelocity(double deltaTime) {
        velocity += acceleration * deltaTime;
    }

    public void updatePosition(double deltaTime) {
        position += velocity * deltaTime;
    }

    //TODO: Add throttle and brake inputs potentially?
}