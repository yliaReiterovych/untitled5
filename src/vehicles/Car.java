package vehicles;

package com.tommy.java.basic.carExample.vehicles;

import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.details.Mode;
import com.tommy.java.basic.carExample.professions.Driver;

public class Car {
    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;

//    public Car(String producer, String aClass, double weight, Driver driver, Engine engine) {
//        this.producer = producer;
//        this.aClass = aClass;
//        this.weight = weight;
//        this.driver = driver;
//        this.engine = engine;
//    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void switchOnHeadlights() {
        System.out.println("Включить фары");
    }

    public void switchOffHeadlights() {
        System.out.println("Выключить фары");
    }

    public void switchOnParkingLights() {
        System.out.println("Включить подсветку");
    }

    public void switchOffParkingLights() {
        System.out.println("Выключить подсветку");
    }

    public void switchOnTurnLeft() {
        System.out.println("Включить поворот налево");
    }

    public void switchOnTurnRight() {
        System.out.println("Включить поворот направо");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}