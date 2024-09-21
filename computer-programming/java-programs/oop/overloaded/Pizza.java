package oop.overloaded;

public class Pizza {
    private String bread;
    private String sauce;
    private String cheese;
    private String topping;

    Pizza(String bread, String sauce, String cheese, String topping) { //constructor
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}

