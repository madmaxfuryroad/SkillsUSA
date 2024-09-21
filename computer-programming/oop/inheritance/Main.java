package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.speed);
        Bike bike = new Bike();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.paddles);
    }
}
