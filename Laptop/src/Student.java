
public class Student {
	String name;
	Integer rollNo, standard, age,hindi=0,marathi=0,english=0,math=0,science=0,socialScience=0,totalMarks=100;

	void studentInfo() {
		System.out.println(String.format("-----STUDENT INFO-----\nName: %s\nRoll No.: %s\nClass: %s\nAge: %s", name != null ? name : "-",
				rollNo != null ? rollNo : "-", standard != null ? standard : "-", age!=null?age:"-"));
	}
	
	void calculatePercentage() {
		Float percentage = (float) (hindi+marathi+english+math+science+socialScience)/(totalMarks*6);
		System.out.println("Percentage = "+percentage*100);
	}
}
