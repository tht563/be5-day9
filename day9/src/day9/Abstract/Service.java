package day9.Abstract;

import java.util.*;

import day9.Data.*;
import day9.Database.*;

public abstract class Service {
	final int LOGOUT = -1;
	
	public static Service findRestaurant(String restaurantName) {
		switch(restaurantName) {
			case ("kfc"):
				return new KFC_SERVICE();
			case ("mcdonal"):
				return new MCDONALD_SERVICE();
			default:
			return null;
		}
	}
	
	public void welcomeMessage() {
		System.out.println("Hello, Welcome. What can I get for you today?");
	};
	
	public abstract void showMenu();
	
	public int[] takeOrder() {
		Scanner scan = new Scanner(System.in);
		
		int[] selectionXquality = new int[2];
	
		System.out.println("--------------------------------------------------");
		System.out.print("What would you like to order: ");
		selectionXquality[0] = scan.nextInt()-1;
		if (selectionXquality[0] == LOGOUT) {
			return (null);
		}
		System.out.print("How many serving of the food: ");
		selectionXquality[1] = scan.nextInt();
		return(selectionXquality);
	};
	
	public void printBill(OrderedItems orderedItems) {
		System.out.println("--------------------------------------------------");
		System.out.println("You have ordered:");
		double total = 0;
		double singlePrice = 0;
		for (int i=0; i<orderedItems.getProducts().size();i++) {
			singlePrice = Math.round(orderedItems.getProducts().get(i).getPrice()*orderedItems.getQuantity().get(i)*100)/100.0;
			System.out.println(orderedItems.getProducts().get(i).getName()+" - "+orderedItems.getQuantity().get(i)+" - $"+singlePrice);
			total += singlePrice;
		}
		total = Math.round(total*100)/100.0;
		System.out.println("Total: $"+total);
	}
	

	public abstract Product saveOrder(int selection);
	
	
	
	
}
