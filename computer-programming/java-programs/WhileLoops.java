import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        int i = 0xC8;
//        while (i < 5_000) {
//            System.out.println(i);
//            i +=1000 ;
//        }

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
    }
}
