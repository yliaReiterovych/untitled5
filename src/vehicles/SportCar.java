package vehicles;

package com.tommy.java.basic.carExample.vehicles;

import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.details.Mode;
import com.tommy.java.basic.carExample.professions.Driver;
import professions.Driver;

public class SportCar extends Car {
    private double speed;
    private Mode mode = Mode.CITY;

    public SportCar(String producer, String aClass, double weight, Driver driver, Engine engine, double speed) {
//        super(producer, aClass, weight, driver, engine);
        this.setProducer(producer);
        this.setaClass(aClass);
        this.setWeight(weight);
        this.setDriver(driver);
        this.setEngine(engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void openTrunk() {
        System.out.println("Открыть багажник");
    }

    public void closeTrunk() {
        System.out.println("Закрыть багажник");
    }

    public void changeMode() {
        if (mode == Mode.CITY) {
            mode = Mode.SPORT;
            System.out.println(mode);
        } else {
            mode = Mode.CITY;
            System.out.println(mode);
        }
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}