public class Printf {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000003240.52929480;

        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        //[width]
        System.out.printf("hello %10s\n", myString);
        System.out.printf("You have this much money: %.2f\n", myDouble);
        System.out.printf("You have this much money: %,.2f\n", myDouble);

    }
}
