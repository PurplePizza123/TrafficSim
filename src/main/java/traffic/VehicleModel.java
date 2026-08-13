package main.java.traffic;
/* TODO: Vehicle Model is make/model specific i.e. toyota corrola, ford f150, subaru forester, ect.
Brakes and engine force would be declared for each independent vehicle
*/
public class VehicleModel {
    public Vehicle civic(double mass, double engineForce, double brakeForce, double dragCoefficient, double maximumBrakingForce, double brakeForceFinal) {
        double MIN = 0;
        double MAX = 105;
        mass = 1305; //kg
        engineForce = 100; //TODO: Find an actual value for this
        brakeForce = 100; //TODO: Find an actual value for this as well
        //TODO: Could I just clamp the brake force value and remove the need for a maximum braking force?
        brakeForceFinal = Math.clamp(brakeForce, MIN, MAX);
        dragCoefficient = 100;
        maximumBrakingForce = 100;
        //TODO: Add something to do with tyres either here or in vehicle.java
        return new Vehicle(mass, engineForce, brakeForceFinal, dragCoefficient, maximumBrakingForce);
    }

    public Vehicle f150(double mass, double engineForce, double brakeForce, double dragCoefficient, double maximumBrakingForce, double brakeForceFinal) {
        double MIN = 0;
        double MAX = 105;
        mass = 1824; //kg
        engineForce = 100;
        brakeForce = 100;
        brakeForceFinal = Math.clamp(brakeForce, MIN, MAX);
        dragCoefficient = 100;
        maximumBrakingForce = 100;
        return new Vehicle(mass, engineForce, brakeForceFinal, dragCoefficient, maximumBrakingForce);
    }
}