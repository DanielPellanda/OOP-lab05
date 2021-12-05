package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;
	
	public ProductImpl(final String name, final int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return "[" + name + ", " + quantity + "]";
	}
	
}
