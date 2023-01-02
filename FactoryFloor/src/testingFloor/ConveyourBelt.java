package testingFloor;

import java.util.ArrayList;

public class ConveyourBelt {
	public ArrayList<Appliance> createAppliance(ArrayList<String> appliances){
		ArrayList<Appliance> createdApplinance = new ArrayList<>();
		for(String appliance:appliances) {
			createdApplinance.add(createAppliance(appliance));
		}
		return createdApplinance;
	}
	
	public void testAppliance(ArrayList<Appliance> appliances){
		for(Appliance appliance:appliances) {
			appliance.testing();
		}
	}
	
	public Appliance createAppliance(String foodName) {
		Appliance appliance = null;
			switch (foodName) {
			case "fan":
				appliance = new Fan();
				break;
				
			case "Buld":
				appliance = new Buld();
				break;
				
			case "Oven":
				appliance = new Oven();
				break;
				
			case "SmartFridge":
				appliance = new SmartFridge();
				break;
				
			case "SmartTV":
				appliance = new SmartTV();
				break;
				

			default:
				break;
			}
			return appliance;	
	}
}
