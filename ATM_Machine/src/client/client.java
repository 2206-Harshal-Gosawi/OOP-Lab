package client;

public class client {

	public static void main(String[] args) {
		//Adding 10 notes each of denomination 2000,500,100
		ATM_Machine atm = new ATM_Machine(10,10,10);
		atm.transaction(1500);
		atm.transaction(7800);
		atm.transaction(900);
	}

}
