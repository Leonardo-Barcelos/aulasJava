package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	//Constructor default
	public Product() {
		
	}
	//Constructor sobrecarga
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//Constructor sobrecarga 2
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//Functions
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return this.name 
				+ ", $" 
				+ String.format("%.2f", this.price) 
				+ ", " 
				+ this.quantity + " units,"
				+ "value $" 
				+ String.format("%.2f", this.totalValueInStock());

	}
}
