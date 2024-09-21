package oop.overloaded;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Pizza myPizza = new Pizza("thick crust", "white", "mozzerlla", "olives");
//        System.out.println("Here are the ingredients of your pizza: ");
//        System.out.println(myPizza.getBread());
//        System.out.println(myPizza.getCheese());
//        System.out.println(myPizza.getSauce());
//        System.out.println(myPizza.getTopping());
//
//        System.out.println("==========================");

        //Pizza[] pizzaas = new Pizza[5];
        ArrayList<Pizza> pizzaas = new ArrayList<>();


        for (int i = 0; i <5; i++) {
            Pizza myPizza = new Pizza("thin crust_" +i, "red_"+i, "lettuce_"+i, "pineapple_"+i);
           // System.out.println("Here are the ingredients of your pizza: ");
            //pizzaas[i] = myPizza;
            pizzaas.add(myPizza);
//            System.out.println("=======================");
        }

        //Pizza secondpizza = pizzaas[1];
        Pizza secondpizza = pizzaas.get(1);
        System.out.println(secondpizza);
//        System.out.println(secondpizza.getBread());
//        System.out.println(secondpizza.getCheese());
//        System.out.println(secondpizza.getSauce());
//        System.out.println(secondpizza.getTopping());




    }
}
