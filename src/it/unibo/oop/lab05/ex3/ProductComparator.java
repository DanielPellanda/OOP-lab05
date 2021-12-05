package it.unibo.oop.lab05.ex3;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getQuantity() + p1.getName().hashCode(), p2.getQuantity() + p2.getName().hashCode());
	}
	
}
