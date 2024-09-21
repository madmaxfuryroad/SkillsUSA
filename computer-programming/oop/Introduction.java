package oop;

public class Introduction {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camery");
        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.drive();
        myCar.brake();

        System.out.println();
        Car myCar2 = new Car();
        System.out.println(myCar2.color);
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.price);

    }
}
