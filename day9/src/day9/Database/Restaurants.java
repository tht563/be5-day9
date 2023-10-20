package day9.Database;

import java.util.ArrayList;

import day9.Data.*;

public class Restaurants {
	public static ArrayList<Restaurant> RESTAURANT_DB = new ArrayList<>();
	
	public static void initRestaurantDB() {
		RESTAURANT_DB.add(new Restaurant("KFC", "114"));
		RESTAURANT_DB.add(new Restaurant("McDonald", "115"));
	}
}
