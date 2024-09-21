public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] cars = {{"Camaro","Corvette", "Honda"},
                            {"Toyota", "BMW", "Rivian"},
                            {"Lambo","Subaru", "Chevy"}};
//        String[][] cars = new String[3][3];
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Honda";
//        cars[1][0] = "Toyota";
//        cars[1][1] = "BMW";
//        cars[1][2] = "Rivian";
//        cars[2][0] = "Lambo";
//        cars[2][1] = "Subaru";
//        cars[2][2] = "Chevy";

        for(int i =0;i<cars.length;i++) {
            System.out.println();
            for (int j = 0; j<cars[i].length;j++) {
                System.out.println(cars[i][j] + " ");
            }
        }
    }
}
