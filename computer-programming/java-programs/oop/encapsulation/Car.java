package oop.encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        setMake(make); //he did this.setMake(make)??
        setModel(model);
        setYear(year);
    }

    public String getMake() { //getter method
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }


    public void setMake(String make) { //setter method
        this.make = make;
    }

    public void setModel(String model) { //setter
        this.model = model;
    }

    public void setYear(int year) { //setter
        this.year = year;
    }

    public void copy(Car x) {
        this.setMake(x.make); // how does this work cuase make is private so how can i just get the attribute?
        this.setModel(x.model);
        this.setYear(x.year);
    }

    Car(Car x) {
        copy(x);
    }

}
