package homework3LoopsMethodsClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;


//Problem 9.	List of Products
//Create a class Product to hold products, which have name (string) 
//and price (decimal number). Read from a text file named "Input.txt" a 
//list of products. Each product will be in format name + space + price. You should 
//hold the products in objects of class Product. Sort the products by price and write
//them in format price + space + name in a file named "Output.txt". Ensure you close 
//correctly all used resources. 

public class ListOfProducts {

	public static void main(String[] args) throws Exception {
		 ArrayList<Product> products = new ArrayList<Product>();
         BufferedReader reader;
         BufferedWriter writer = null;
         try {
                 reader = new BufferedReader(new FileReader("src/inputProducts.txt"));
                 String line = null;
                 while ((line = reader.readLine()) != null) {
                    String[] splittedLine = line.split(" ");
                    products.add(new Product(splittedLine[0], Double.parseDouble(splittedLine[1])));
                 }
                 Collections.sort(products);
                
                 writer = new BufferedWriter(new FileWriter("src/output.txt"));
                 for(Product product : products){
                         writer.write(product.getPrice() + " " + product.getName() + "\r\n");
                 }
                 writer.close();
         }
         catch (Exception e) {
                 System.out.println("Error");
         }
}

	}


