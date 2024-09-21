package javaswing.testing;

public class papatoldmetodothisandiamgoingtofail {
    public static void main(String[] args) {
        String a = "123"; //stored at same memory location!!
        String b = "123";
        System.out.println(a == b); //true

        Integer x = new Integer(123); //stored at different memory locations
        Integer y = new Integer(123);
        System.out.println(x == y); //false

        String s = new String("123");
        String t = new String("123");
        System.out.println(s == t);
    }
}
