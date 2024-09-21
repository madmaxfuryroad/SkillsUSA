import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int r = 1; r <=rows; r++) {
            System.out.println();
            for (int c = 1; c<=columns; c++) {
                System.out.print(symbol);
            }
        }
    }
}
