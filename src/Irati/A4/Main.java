package Irati.A4;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/Irati/A4/file.txt");
        if (file1.delete()) {
            System.out.println("File deleted: " + file1.getName() + ".");
        } else {
            System.out.println("Not found.");
        }
    }
}

