package tut7.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart { //0.5

	private final int id; //0.5
	private static int counter; //0.5
	private final List<Product> products; //0.5

	public ShoppingCart() { //0.5
		counter++; //0.5
		this.id = counter;  //0.5
		products = new ArrayList<>(); //0.5
	}

	public int getId() { //0.5
		return id; //0.5
	}

	public static int getCounter() { //0.5
		return counter; //0.5
	}

	public void addProduct(Product product) { //0.5
		products.add(product); //1
	}

	public double getAveragePriceIfExpiredInYear(int year) { //0.5
		double price = 0; //0.5
		int count = 0; //0.5
		for (Product p : products) { //1
			if (p.getExpirationDate().getYear() == year) { //1
				price += p.getPrice(); //1
				count++; //1
			}
		}
		if (count != 0) { //1
			return price / count; //0.5
		} else {
			return 0.0; //0.5
		}
	}

	public int getGroceryTypeCount(GroceryType groceryType) { //0.5
		int count = 0; //0.5
		for (Product p : products) { //1
			if (p.getGroceryType() == groceryType) { //1
				count++; //1
			}
		}
		return count; //0.5
	}

	@Override //+0.25
	public String toString() { //0.5
		return "ShoppingCart{" + "id=" + id + ", products=" + products + '}'; //1
	}
}
