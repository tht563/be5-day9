package day9.Database;

import java.util.*;

import day9.Data.*;

public class KFC_DB {
	public static ArrayList<Product> PRODUCT_DB = new ArrayList<>();
	
	public static void initProductDB() {
		PRODUCT_DB.clear();
		PRODUCT_DB.add(new Product("Zinger Burger", 15.95));
		PRODUCT_DB.add(new Product("3 Pieces Hot & Crispy", 8.45));
		PRODUCT_DB.add(new Product("10 Pieces Chicken Wing", 15.95));
	}

	
}
