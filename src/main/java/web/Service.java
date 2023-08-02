package web;

import java.util.ArrayList;
import java.util.List;

public class Service {
        private static List<Car> carList;

    public static List<Car> getCar() {
        Car car1 = new Car("BMW", "750IL", 2001);
        Car car2 = new Car("LAND ROVER", "RANGE ROVER", 2013);
        Car car3 = new Car("BMW", "540i", 1995);
        Car car4 = new Car("BMW", "M4", 2023);
        Car car5 = new Car("BMW", "X5", 2012);
        carList= new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;

    }

}
