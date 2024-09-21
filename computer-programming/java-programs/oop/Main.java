package oop;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.openGarage();

        Car car = new Car("BMW");

        garage.park(car);
        System.out.println("Total number of cars parked: "+garage.getCarCount());

        car = new Car("Toyota");
        garage.park(car);
        System.out.println("Total number of cars parked: "+garage.getCarCount());

        System.out.println(garage.isCarPresent("toyota"));

        garage.closeGarage();
        car = garage.takeCarOut("BMW");
        System.out.println("This car has been taken out of the garage: "+car);

        System.out.println("Total number of cars parked: "+garage.getCarCount());


    }
}
