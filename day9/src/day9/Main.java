package day9;

import java.util.*;

import day9.Abstract.*;
import day9.Data.*;
import day9.Database.*;

public class Main {
	
	final static int kfc = 1;
	final static int mcdonald = 2;
	private static KFC_SERVICE service;
	
	public static void main (String[] args) {
		String restaurantName = showRestaurants();
		showRestaurantDetails(restaurantName);
	}
	
	public static void showRestaurantDetails(String restaurantName) {
		int[] selectionXquality = new int[2];
		OrderedItems orderedItems = new OrderedItems();
		
		Service service = Service.findRestaurant(restaurantName);
		
		do {
			service.showMenu();
			selectionXquality = service.takeOrder();
			if (!Objects.isNull(selectionXquality)) {
				orderedItems.addProduct(service.saveOrder(selectionXquality[0]));
				orderedItems.addQuantity(selectionXquality[1]);
			}
			if (Objects.isNull(selectionXquality)) {
				break;
			}
		}while (true);
		service.printBill(orderedItems);
	}
	
	public static String showRestaurants() {
		Scanner scan = new Scanner(System.in);
		Restaurants.initRestaurantDB();
		
		System.out.println("--------------------------------------------------");
		System.out.println("Welcome to Menulog!");
		System.out.println("This is the list of available restaurants");
		for(int i=0; i<Restaurants.RESTAURANT_DB.size();i++) {
			System.out.println(i+1+". "+Restaurants.RESTAURANT_DB.get(i).getName());
		}
		System.out.print("Please enter the restaurant you want to order: ");
		int selection = scan.nextInt();
		switch(selection) {
			case kfc:
				return ("kfc");
			case mcdonald:
				return ("mcdonald");
			default:
				return (null);
		}
	}
}
