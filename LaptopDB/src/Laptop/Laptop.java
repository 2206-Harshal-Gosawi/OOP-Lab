package Laptop;

public class Laptop {
	private String brandName,modelName,OS;
	private Integer sellingPrice,storageCapacity;
	private Boolean isStorageSSD;
	private Double screenSize;
	
	public Laptop(String brandName,String modelName,Integer sellingPrice,Double screenSize,Integer storageCapacity,Boolean isStorageSSD,String OS) {
		this.brandName=brandName;
		this.modelName=modelName;
		this.screenSize=screenSize;
		this.storageCapacity=storageCapacity;
		this.OS=OS;
		this.sellingPrice=sellingPrice;
		this.isStorageSSD=isStorageSSD;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsStorageSSD() {
		return isStorageSSD;
	}

	public void setIsStorageSSD(Boolean isStorageSSD) {
		this.isStorageSSD = isStorageSSD;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}

	
	
}
