package client;

public class Slot {
	Integer amount;
	Integer count;
	public Slot(Integer amount,Integer count) {
		this.amount=amount;
		this.count=count;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}
