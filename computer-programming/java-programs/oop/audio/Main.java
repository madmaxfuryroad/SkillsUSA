package oop.audio;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/sukanyadhiman/My_Projects_Final/My_Programming/Java_programming/Bro_Code_Course/oop/audio/file_example_WAV_1MG.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(ais); //shows that the audio is operational


        String response = "";
        Scanner scanner = new Scanner(System.in);

        while (response!="Q") {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case("P") : clip.start();
                break;
                case("S") : clip.stop();
                break;
                case("R") : clip.setMicrosecondPosition(0);
                break;
                case("Q") : clip.close();
                default: System.out.println("Not a valid input.");
            }
        }
        System.out.println("BYEEE!");



    }
}
