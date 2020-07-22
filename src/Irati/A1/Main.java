package Irati.A1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("src/Irati/A1/my_files/myFile.txt");
            if (file.createNewFile()){
                System.out.println("File created!");
            } else {
                System.out.println("File already exists");
            }
            FileWriter file1 = new FileWriter("src/Irati/A1/my_files/myFile.txt");
            file1.write("Hello World!");
            file1.close();
            System.out.println("Successfully wrote to file.");
        } catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
