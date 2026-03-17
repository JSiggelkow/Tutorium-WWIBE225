package tut7.aufgabe1;

public enum GroceryType {

	MEAT("Meat"),
	FRUITS("Fruits"),
	VEGETABLES("Vegetables"),
	BEVERAGES("Beverages"),
	SNACKS("Snacks");

	private final String description;

	GroceryType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
