package oop.superkeyword2;

class Car extends Vehicle {
    String make;
    String model;

    Car(String make, String model, int year) {
        super(year);
        this.make = make;
        this.model = model;
    }

    void sayHello() {
        System.out.println(year);
    }
}
