package day9.Data;

import java.util.ArrayList;

public class OrderedItems {
	
	ArrayList <Product> products;
	ArrayList <Integer> quantity;
	
	public OrderedItems() {
		products = new ArrayList<Product>();
		quantity = new ArrayList<Integer>();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(ArrayList<Integer> quantity) {
		this.quantity = quantity;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void addQuantity(int quantity) {
		this.quantity.add(quantity);
	}
	
	
}
