package Exercise7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // Creating an arraylist with all the words line-by-line from a text file
        File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "words.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                    stringList.add(currentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sorting the list alphabetically
        Collections.sort(stringList);

        // Outputting the results
        for (String s : stringList) {
            System.out.println(s);
        }

        // Storing the sorted list in a new file
        try {
            File outputFile = new File(System.getProperty("user.dir") + File.separator + "Sort_Output.txt");
            FileWriter writer = new FileWriter(outputFile);

            StringBuilder stringBuilder = new StringBuilder();
            for (String s : stringList) {
                stringBuilder.append(s + "\n");
            }

            writer.write(stringBuilder.toString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted list has been created");
    }
}
