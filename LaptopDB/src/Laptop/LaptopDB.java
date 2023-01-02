package Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaptopDB {
	private Map<String, Laptop> laptops = new HashMap<String, Laptop>();

	public LaptopDB(Map<String, Laptop> laptopList) {
		// TODO Auto-generated constructor stub
		this.laptops = laptopList;
	}

	public ArrayList<Laptop> listAllLaptops() {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			allLaptops.add(value);
		});
		return allLaptops;
	}

	public ArrayList<Laptop> filterByBrand(String brand) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (value.getBrandName() == brand) {
				allLaptops.add(value);
			}
		});
		return allLaptops;
	}

	public ArrayList<Laptop> filterBySellingPrice(Boolean isLessThen, Integer amount) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (isLessThen) {
				if (value.getSellingPrice() <= amount) {
					allLaptops.add(value);
				}
			} else {
				if (value.getSellingPrice() >= amount) {
					allLaptops.add(value);
				}
			}
		});
		return allLaptops;
	}
	
	
	public ArrayList<Laptop> filterByScreenSize(Boolean isLessThen, Double size) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (isLessThen) {
				if (value.getScreenSize() <= size) {
					allLaptops.add(value);
				}
			} else {
				if (value.getScreenSize() >= size) {
					allLaptops.add(value);
				}
			}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByMinStorageCapacity(Integer storage) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (value.getStorageCapacity() >= storage) {
				allLaptops.add(value);
			}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterBySSD(Boolean isSSD) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if(isSSD) {
				if (value.getIsStorageSSD()) {
					allLaptops.add(value);
				}	
			}else {
				if (!value.getIsStorageSSD()) {
					allLaptops.add(value);
				}
			}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByOS(String OS) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (value.getOS() == OS) {
				allLaptops.add(value);
			}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> searchLaptopByModel(String model) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (value.getModelName().contains(model)) {
				allLaptops.add(value);
			}
		});
		return allLaptops;
	}

}
