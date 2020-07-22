package Irati.A3;

import java.io.*;
import java.util.*;

public class eggRecipe {

    public int countEgg() throws FileNotFoundException {
        File file = new File("src/Irati/A3/readme.txt");
        Scanner scanner = new Scanner(file);
        int count =  0;
        String word = "egg";
        while(scanner.hasNext(word)){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            File file = new File("src/Irati/A3/readme.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String output = scanner.nextLine();
                System.out.println(output);
            }
            eggRecipe recipe = new eggRecipe();
            System.out.println(recipe.countEgg()) ;
            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
