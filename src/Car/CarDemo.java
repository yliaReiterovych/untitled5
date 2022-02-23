package Car;

import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;
import com.tommy.java.basic.carExample.vehicles.*;

package com.tommy.java.basic.carExample;

public class CarDemo {
    public static void main(String[] args) {
        Driver bmwDriver = new Driver("Волошин В.В.", 40,  30);
        Engine bmwEngine = new Engine("80", "BMW");
//        Car car = new Car("BMW", "C", 5000, bmwDriver, bmwEngine);
        Car car = new Car();
        car.setProducer("BMW");
        car.setaClass("C");
        car.setWeight(5000);
        car.setDriver(bmwDriver);
        car.setEngine(bmwEngine);

        Driver lorryDriver = new Driver("Волошин В.В.", 40,  20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("Иванов В.В.", 30,  15);
        Engine sportEngine = new Engine("100", "SportEngine");
        SportCar sportCar = new SportCar("SportCar", "C", 4000, sportDriver, sportEngine, 350);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);

        lorry.switchOnHeadlights();
        lorry.switchOnParkingLights();
        sportCar.openTrunk();
        sportCar.changeMode();
    }
}
