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
        } catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
