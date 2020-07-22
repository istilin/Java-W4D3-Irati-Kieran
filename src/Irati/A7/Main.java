package Irati.A7;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();

        File file = new File("src/Irati/A7/words.txt");
        try {
            Scanner scanner = new Scanner(file);

            String thisLine;
            while (scanner.hasNextLine()) {
                thisLine = scanner.nextLine();
                wordsList.add(thisLine);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(wordsList);

        try {
            File fileOrder = new File("src/Irati/A7/words_order.txt");
            FileWriter fileWrite = new FileWriter(fileOrder);

            for (String word : wordsList) {
                fileWrite.write(word + "\n");
            }

            fileWrite.close();
            System.out.println("File was created");

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}