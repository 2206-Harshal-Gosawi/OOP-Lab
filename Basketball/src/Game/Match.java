package Game;

public class Match {
	Ball ball;
	Team teams[];
	Score score[];
	Refree refrees[];

	public Match(Ball ball, Team[] teams, Score[] score, Refree[] refrees) {
		this.ball = ball;
		this.teams = teams;
		this.score = score;
		this.refrees = refrees;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Team[] getTeams() {
		return teams;
	}

	public void setTeams(Team[] teams) {
		this.teams = teams;
	}

	public Score[] getScore() {
		return score;
	}

	public void setScore(Score[] score) {
		this.score = score;
	}

	public Refree[] getRefrees() {
		return refrees;
	}

	public void setRefrees(Refree[] refrees) {
		this.refrees = refrees;
	}
	
	
}
