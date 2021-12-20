package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

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
				+ "," 
				+ this.quantity + " units $" 
				+ String.format("%.2f", this.totalValueInStock());

	}
}
