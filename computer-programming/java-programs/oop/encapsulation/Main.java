package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", 2013); //constructor method only runs during declaration, not line 6??
//        System.out.println(car.getYear());
//        car.setYear(2022);
//        System.out.println(car.getYear());

        //Car car2 = new Car("Toyota", "Camery", 2020);
        Car car2 = new Car(car1);
        //car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
