package oop;

public class Car {
    String make;
    String  model;
    int year;
    String color;
    double price;

    Car() {

    }

    Car(String make) {
        this.make = make;
    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    Car(int year) {
        this.year = year;
    }

    Car(String ma, String mo, int y) {
        make = ma;
        model = mo;
        year = y;
    }





    void drive() {
        System.out.println("You are driving a "+this.make);
    }
    void brake() {
        System.out.println("You are applying the breaks on a "+this.make);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


