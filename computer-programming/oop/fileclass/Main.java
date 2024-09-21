package oop.fileclass;
import java.io.File;

public class Main {
    public static void main(String[] args) {
//        File file = new File("/Users/sukanyadhiman/My_Projects_Final/My_Programming/Java_programming/Bro_Code_Course/oop/fileclass/secret.pages");
//
//        if(file.exists()) {
//            System.out.println("File Exists");
//        }
//        else {
//            System.out.println("File Does Not Exist");
//        }

        File file = new File("oop/fileclass/secret.pages");
        if (file.exists()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        File f = new File("/Users/sukanyadhiman");
        File[] children = f.listFiles();
        isPresent(children);
    }
    private static void isPresent(File[] children) {
        if (children == null) {
            return;
        }
        for (int i = 0; i < children.length; i++) {
            File f = children[i];
            if (f.isFile()) {
                if (f.getName().equalsIgnoreCase("secret.pages")) {
                    System.out.println("File Found: "+f.getAbsolutePath());
                    break;
                }
            }
            else {
                File[] subchildren = f.listFiles();
                isPresent(subchildren);

            }
        }
    }

}
