package oop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
//        scanner.close();
        try {
            int age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a valid input -- input missing exception was thrown "+ e.toString());
        } catch (IllegalStateException e) {
            System.out.println("Not a valid input -- illegal state exception was thrown " + e.getMessage());
        } finally {
            System.out.println("This prints no matter the outcome.");
        }
//        System.out.println(age);



    }
}
