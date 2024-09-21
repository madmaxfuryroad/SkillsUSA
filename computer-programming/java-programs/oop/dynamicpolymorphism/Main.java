package oop.dynamicpolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want: ");
        System.out.println("1 = Dog or 2 = Cat: ");
        int choice = scanner.nextInt();
        Animal animal;

        if (choice == 1) {
            animal = new Dog();
            animal.speak(); //why does it use the method for dogs, not the animal
        }
        if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("Choice was invalid.");
            animal.speak();
        }
    }
}
