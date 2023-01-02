import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Laptop.Laptop;
import Laptop.LaptopDB;

public class ClientApp {

	public static void main(String[] args) {
	    Map<String, Laptop> laptops = new HashMap<String, Laptop>();
	    laptops.put("Apple Macbook Air 2017", new Laptop("Apple", "Macbook Air 2017", 64692, 13.3, 128, true, "iOS Sierra"));
	    laptops.put("HP 15s", new Laptop("HP", "15s", 49490, 15.6, 512, true, "Windows 10"));
	    laptops.put("Apple Macbook pro 2017", new Laptop("Apple", "Macbook pro 2017", 129999, 15.4, 256, true, "iOS Sierra"));
	    laptops.put("Lenovo Ideapad Slim 3i", new Laptop("Lenovo", "Ideapad Slim 3i", 52490, 15.6, 1000, false, "Windows 10"));
	    
	    LaptopDB laptopDB = new LaptopDB(laptops);
	    
	    ArrayList<Laptop> allLaptops = laptopDB.listAllLaptops();
	    printLaptops("All Laptops",allLaptops);
	    
	    allLaptops=laptopDB.filterByBrand("Apple");
	    printLaptops("Brand Name = 'Apple'",allLaptops);
	    
	    allLaptops=laptopDB.filterBySellingPrice(true, 60000);
	    printLaptops("Selling Price <= 60000",allLaptops);
	    
	    allLaptops=laptopDB.filterBySellingPrice(false, 60000);
	    printLaptops("Selling Price >= 60000",allLaptops);
	    
	    allLaptops=laptopDB.filterByScreenSize(true, 15.4);
	    printLaptops("Screen Size <= 15.4''",allLaptops);
	    
	    allLaptops=laptopDB.filterByScreenSize(false, 15.4);
	    printLaptops("Screen Size >= 15.4''",allLaptops);
	    
	    allLaptops=laptopDB.filterByMinStorageCapacity(500);
	    printLaptops("Minimun Storage Capacity of 500 GB",allLaptops);
	    
	    allLaptops=laptopDB.filterBySSD(true);
	    printLaptops("Laptops with SSD",allLaptops);
	    
	    allLaptops=laptopDB.filterBySSD(false);
	    printLaptops("Laptops without SSD",allLaptops);
	    
	    allLaptops=laptopDB.filterByOS("iOS Sierra");
	    printLaptops("Laptops with 'iOS Sierra' OS",allLaptops);
	    
	    allLaptops=laptopDB.searchLaptopByModel("Macbook");
	    printLaptops("Laptops searched by 'Macbook' keyword",allLaptops);
	}
	
	public static void printLaptops(String message,ArrayList<Laptop> laptops) {
		System.out.println("----------"+message+"----------");
		for(Laptop i:laptops) {
			System.out.println("Brand: "+i.getBrandName()+", Model: "+i.getModelName()+", Price: "+i.getSellingPrice()+"/-Rs, Screen Size: "+i.getScreenSize()+"'', Storage: "+i.getStorageCapacity()+" GB, SSD: "+(i.getIsStorageSSD()?"YES":"NO")+", OS: "+i.getOS());;
		}
		System.out.println("\n");
	}

}
