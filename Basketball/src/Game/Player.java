package Game;

public class Player {
	String name;
	Integer jersyNum;
	
	public Player(String name, Integer jersyNum) {
		this.name = name;
		this.jersyNum = jersyNum;
	}
	
	void dribbles(Ball b) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJersyNum() {
		return jersyNum;
	}

	public void setJersyNum(Integer jersyNum) {
		this.jersyNum = jersyNum;
	}

}
