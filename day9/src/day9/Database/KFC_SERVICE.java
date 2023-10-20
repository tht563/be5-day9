package day9.Database;

import day9.Abstract.Service;
import day9.Data.Product;
import day9.Database.*;

public class KFC_SERVICE extends Service {

	@Override
	public void showMenu() {
		KFC_DB.initProductDB();
		System.out.println("--------------------------------------------------");
		System.out.println("0. Checkout");
		for (int i=0; i<KFC_DB.PRODUCT_DB.size();i++) {
			System.out.println(i+1+". "+KFC_DB.PRODUCT_DB.get(i).getName()+" - "+KFC_DB.PRODUCT_DB.get(i).getPrice());
		}
		
	}

	@Override
	public Product saveOrder(int selection) {
		return(KFC_DB.PRODUCT_DB.get(selection));
		
	}	
	
}
