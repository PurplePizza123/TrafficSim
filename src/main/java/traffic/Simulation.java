package main.java.traffic;

import com.sun.jdi.CharType;
import org.w3c.dom.css.CSSStyleSheet;

import java.util.ArrayList;
import java.util.List;

import static main.java.traffic.CarType.CIVIC;
import static main.java.traffic.CarType.F150;

public class Simulation {

    List<Vehicle> vehicles;
    CarType type;

    public Simulation() {
        vehicles = new ArrayList<>();
        type = CIVIC;
    }

    public void update(double deltaTime) {
        for (Vehicle v : vehicles) {
            double acceleration = Physics.calculateAcceleration(v,type);

            v.setAcceleration(acceleration);

            v.updateVelocity(deltaTime);
            v.updatePosition(deltaTime);
        }
    }

    public void createVehicles() {
        vehicles.add(new Vehicle(CIVIC));
        vehicles.add(new Vehicle(CIVIC));
        vehicles.add(new Vehicle(F150));
    }

    public Vehicle getVehicle() {
        return null;
    }
}