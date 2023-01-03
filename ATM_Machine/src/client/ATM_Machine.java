package client;

public class ATM_Machine {
	Slot note_2000, note_500, note_100;

	public ATM_Machine(Integer c1, Integer c2, Integer c3) {
		this.note_2000 = new Slot(2000, c1);
		this.note_500 = new Slot(500, c2);
		this.note_100 = new Slot(100, c3);
	}

	public void transaction(Integer amount) {
		Integer c_2000 = 0, c_500 = 0, c_100 = 0;
		Integer c_2000_i = note_2000.getCount(), c_500_i = note_500.getCount(), c_100_i = note_100.getCount();
		Boolean outFlag = false;
		if (amount < 100) {
			System.out.println("Sorry there are no lower denomination notes, only 100 Rs and above notes are present");
			return;
		}
		while (amount > 0) {
			if (amount >= 2000 && c_2000_i > 0) {
				c_2000 = c_2000 + 1;
				amount = amount - 2000;
				c_2000_i=c_2000_i-1;
			} else if (amount >= 500 && c_500_i > 0) {
				c_500 = c_500 + 1;
				amount = amount - 500;
				c_500_i=c_500_i-1;
			} else if (amount >= 100 && c_100_i > 0) {
				c_100 = c_100 + 1;
				amount = amount - 100;
				c_100_i=c_100_i-1;
			} else if (amount > 0) {
				System.out.println("ATM Out of required notes");
				outFlag = true;
				break;
			}
		}
		if (outFlag == false) {
			note_2000.setCount(c_2000_i);
			note_500.setCount(c_500_i);
			note_100.setCount(c_100_i);
			System.out.println("2000 Notes = " + c_2000 + ", 500 Notes = " + c_500 + ", 100 Notes = " + c_100);
		}
	}
}
