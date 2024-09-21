import java.util.ArrayList;

public class ArrayLists2D {
    public static void main(String[] args) {
        //2D list
        //make an ArrayList where each element is an ArrayList type
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList(); //making an object of that class
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("cake");

        ArrayList<String> produceList = new ArrayList(); //making an object of that class
        produceList.add("tomatoes");
        produceList.add("lettuce");
        produceList.add("spices");

        ArrayList<String> drinksList = new ArrayList(); //making an object of that class
        drinksList.add("sparkling water");
        drinksList.add("coconut water");
        drinksList.add("iced tea");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);

        System.out.println(groceryList.get(0).get(2));
    }
}