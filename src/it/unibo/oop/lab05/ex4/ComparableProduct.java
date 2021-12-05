package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product>, Product{


	public ComparableProduct(String name, int quantity) {
		super(name, quantity);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(p.getName());
	}
}
