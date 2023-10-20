package day9.Database;

import java.util.*;

import day9.Data.*;

public class MCDONALD_DB {
	public static ArrayList<Product> PRODUCT_DB = new ArrayList<>();
		
		public static void initProductDB() {
			PRODUCT_DB.clear();
			PRODUCT_DB.add(new Product("Big Mac Burger", 7.95));
			PRODUCT_DB.add(new Product("Cheese Burger", 5.45));
			PRODUCT_DB.add(new Product("20 Pieces Chicken Nuggets", 20.95));
		}
}
