package Game;

public class Score {
	Integer team1Score;
	Integer team2Score;

	public Score(Integer team1Score, Integer team2Score) {
		super();
		this.team1Score = team1Score;
		this.team2Score = team2Score;
	}

	public Integer getTeam1Score() {
		return team1Score;
	}

	public void setTeam1Score(Integer team1Score) {
		this.team1Score = team1Score;
	}

	public Integer getTeam2Score() {
		return team2Score;
	}

	public void setTeam2Score(Integer team2Score) {
		this.team2Score = team2Score;
	}

}
