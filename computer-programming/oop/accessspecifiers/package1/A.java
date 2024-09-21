package oop.accessspecifiers.package1;
import oop.accessspecifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        // System.out.println(c.defaultMessage); defaultMessage method has no access modifier so it is only available to classes within its own package
        System.out.println(c.publicMessage); //publicMessage uses the public modifer meaning that other classes can also use it

    }

}
