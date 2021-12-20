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
	
	public void displayProduct() {
		System.out.println("Product: " + this.name + ", Price: " + this.price + ", Quantity: " + this.quantity);
	}
}
