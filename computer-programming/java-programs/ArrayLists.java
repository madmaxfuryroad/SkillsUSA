import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //need to use wrapper classes
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("pasta");
        food.add("water");

        food.set(0, "sushi");
        

        for(int i=0; i<food.size();i++) {
            System.out.println(food.get(i));
        }
    }
}
