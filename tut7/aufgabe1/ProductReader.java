package tut7.aufgabe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductReader { //0.5

	public static List<Product> readProducts(File file) //0.5
			throws FileNotFoundException {  //+0.5
		List<Product> products = new ArrayList<>(); //0.5
		Scanner scanner = new Scanner(file); //0.5

		while (scanner.hasNextLine()) { //1
			String line = scanner.nextLine(); //1
			String[] tokens = line.split(";"); //1

			String name = tokens[0]; //1
			double price = Double.valueOf(tokens[1]); //1
			int year = Integer.valueOf(tokens[2]); //0.5
			int month = Integer.valueOf(tokens[3]); //0.5
			int day = Integer.valueOf(tokens[4]); //0.5
			LocalDate expirationDate = LocalDate.of(year, month, day); //1
			GroceryType groceryType = GroceryType.valueOf(tokens[5]); //1

			Product product = new Product(name, price, expirationDate, groceryType); //1
			products.add(product); //0.5
		}

		scanner.close(); //+0.5
		return products; //0.5
	}
}
