package oop.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sukanya.txt");
            writer.write("I am tired \nThis is so cool \nBut I am still tired \nSo yeah");
            writer.append("\nappending stuff...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
