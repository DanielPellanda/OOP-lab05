package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse{
	
	protected Set<Product> products;
	
	public WarehouseImpl() {
		products = new TreeSet<>(new ProductComparator());
	}
	
	public void addProduct(final Product p) {
		products.add(p);
	}
	
	public Set<String> allNames(){
		Set<String> names = new TreeSet<>();
		
		for(Product p : products) {
			names.add(p.getName());
		}
		
		return names;
	}
	
	public Set<Product> allProducts(){
		Set<Product> p = new TreeSet<>(new ProductComparator());
		for(Product pr : products) {
			p.add(pr);
		}
		return p;
	}
	
	public boolean containsProduct(Product p) {
		return products.contains(p);
	}
	
	public double getQuantity(String name) {
		for(Product p : products) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return 0;
	}
}
