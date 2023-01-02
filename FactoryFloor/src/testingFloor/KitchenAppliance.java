package testingFloor;

public class KitchenAppliance extends Appliance{
	
	public KitchenAppliance(String applianceName,Boolean wifiEnabled) {
		super(applianceName,wifiEnabled,"Kitchen Appliance","");
	}
	public KitchenAppliance(String applianceName,Boolean wifiEnabled,String brand) {
		super(applianceName,wifiEnabled,"Kitchen Appliance",brand);
	}
	
}
