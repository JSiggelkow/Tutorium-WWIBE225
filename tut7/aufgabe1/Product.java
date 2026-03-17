package tut7.aufgabe1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Product {
	private final String name;
	private double price;
	private final LocalDate expirationDate;
	private final GroceryType groceryType;

	public Product(String name, double price, LocalDate expirationDate, GroceryType groceryType) {
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
		this.groceryType = groceryType;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public GroceryType getGroceryType() {
		return groceryType;
	}
}
