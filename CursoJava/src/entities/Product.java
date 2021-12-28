package entities;

public class Product {
	protected String name;
	protected double price;
	protected int quantity;
	
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
