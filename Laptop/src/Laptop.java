
public class Laptop {
	String name="-";

	void switchOn() {
		System.out.println(String.format("Your %s Laptop Switched On!", name));
	}

	void switchOff() {
		System.out.println(String.format("Your %s Laptop Switched Off!", name));
	}
}
