/*
 * Choose any integer, double it,
 * add six, divide it in half, and subtract
 * the number you started with. The
 * answer is always three!
 */

import java.util.Scanner;

public class NumbersRiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //asking user for number
        System.out.print("Enter your number: ");
        int num = scanner.nextInt(); //storing users number
        int originalNum = num;

        num *=2;
        System.out.println("Multiplying by 2: " + num);

        num +=6;
        System.out.println("Adding 6: "+ num);

        num /= (double)2;
        System.out.println("Dividing by 2: "+ num);

        num -=originalNum;
        System.out.println("Final number: "+ num);
    }
}

