package testingFloor;

public class Appliance {
	private String applianceType;
	private String applianceName;
	private Boolean wifiEnabled;
	private String brand;
	
	public Appliance(String applianceName,Boolean wifiEnabled,String applianceType,String brand ) {
		this.applianceName=applianceName;
		this.wifiEnabled=wifiEnabled;
		this.applianceType=applianceType;
		this.brand=brand;
	}
	
	
	public void switchOnAppliance() {
		System.out.println("Switching on "+applianceName);
	}


	public void testing() {
		System.out.println("Wifi testing for "+applianceType+": "+applianceName+" => ");
		if(wifiEnabled) {
			System.out.print("PASSED");
		}else {
			System.out.print("FAILED");
		}
	}

	
	
}
