package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle[] racers = {car, bike, boat};

        for (int i = 0; i <= racers.length; i++) {
            Vehicle v = racers[i];
            v.go();
        }


        for (Vehicle x : racers) {
            x.go(); //how does it print because the command goes to Vehicle.java and there is no print statement in there..
        }
    }
}
