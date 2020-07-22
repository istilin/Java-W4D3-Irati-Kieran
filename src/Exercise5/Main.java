package Exercise5;

import Exercise5.classes.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void printReport(HashMap<Integer, Product> stockHashMap){
        final String workingDir = System.getProperty("user.dir");
        final String reportName = "report.txt";

        try {
            File file = new File(workingDir + File.separator + reportName);

            file.createNewFile();

            StringBuilder stringBuilder = new StringBuilder();
            for (Product p : stockHashMap.values()) {
                stringBuilder.append(p.toString());
                stringBuilder.append("\n");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("Report has been created");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Product> shopStock = new HashMap<>();
        shopStock.put(0, new Product("Voeslauer sparkling water", 1.99, 10, "It's wet"));
        shopStock.put(1, new Product("Ice Tea", 2.50, 10, "Has some lemon in it"));

        printReport(shopStock);
    }
}
