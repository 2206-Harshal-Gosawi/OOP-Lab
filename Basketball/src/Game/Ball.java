package Game;

public class Ball {
	String company;
	Float circumference;
	Integer weight;

	public Ball(String company, float circumference, Integer weight) {
		super();
		this.company = company;
		this.circumference = circumference;
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getCircumference() {
		return circumference;
	}

	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}
