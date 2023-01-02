
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop();
		l1.name = "Lenove";
		l1.switchOn();

		Laptop l2 = new Laptop();
		l2.name = "Dell";
		l2.switchOn();
		
		l1.switchOff();
		
		Student s1 = new Student();
		s1.name="Harshal Gosawi";
		s1.age=16;
		s1.rollNo=2206;
		
		s1.hindi=50;
		s1.marathi=60;
		s1.english=70;
		s1.math=80;
		s1.science=90;
		s1.socialScience=100;	

		s1.studentInfo();
		
		s1.calculatePercentage();

	}

}
