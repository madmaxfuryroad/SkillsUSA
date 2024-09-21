package oop.arraytest;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("meat");
        Food food2 = new Food("spices");
        Food food3 = new Food("almonds");

        Food[] freezer = new Food[3]; //making an array of type Food
        freezer[0] = food1;
        freezer[1] = food2;
        freezer[2] = food3;

        System.out.println(freezer[0].name);
        System.out.println(freezer[1].name);
        System.out.println(freezer[2].name);

    }
}
