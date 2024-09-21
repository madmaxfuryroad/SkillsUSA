package oop;

import java.util.ArrayList;

public class Garage {
    boolean open = false;
    ArrayList<Car> carList = new ArrayList<>();


    void park(Car car) {

        if (!isGarageOpen()) {
            System.out.println("Garage is closed; please open garage. No car was parked.");
            return;
        }
        System.out.println("The car, " + car.make + " has been parked.");
        carList.add(car);
    }

    int getCarCount() {
        return carList.size();
    }

    boolean isCarPresent(String make) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).make.equalsIgnoreCase(make)) {
                return true;
            }
        }
        return false;
    }

    Car takeCarOut(String make) {
        if (!isGarageOpen()) {
            System.out.println("Garage is closed; please open garage. Cannot take out car.");
            return null;
        }
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).make.equalsIgnoreCase(make)) {
                Car c = carList.get(i);
                carList.remove(c);
                return c;
            }
        }
        return null;
    }

    boolean isGarageOpen() {
        return open;
    }

    void openGarage() {
        open = true;
    }

    void closeGarage() {
        open = false;
    }
}

