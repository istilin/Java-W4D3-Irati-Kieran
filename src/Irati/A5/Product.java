package Irati.A5;
import java.util.*;
import java.io.*;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String description;

    public Product(String name, double price, int quantity, String description){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }


    public void printReport(ArrayList <Product> myFruits) {
        try {
            File report = new File("src/Irati/A5/report.txt");
            if (report.createNewFile()) {
                FileWriter report2 = new FileWriter("src/Irati/A5/report.txt");
                for (Product fruit : myFruits) {
                    report2.write(fruit.name + "\n");
                    report2.write("    Price: " + fruit.price + "\n");
                    report2.write("    Quantity: " + fruit.quantity + "\n");
                    report2.write("    Description: " + fruit.description + "\n\n");
                }
                report2.close();
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Banana", 0.46, 9, "Bananas are good!");
        Product product2 = new Product("Watermelon", 2.56, 2, "Watermelons are good!");
        Product product3 = new Product("Melon", 1.99, 1, "Melons are good!");
        Product product4 = new Product("Cherry", 0.11, 50, "Cherries are good!");
        Product product5 = new Product("Mango", 3.32, 3, "Mangos are good!");

        ArrayList <Product> fruits = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));

        product1.printReport(fruits);

    }
}


