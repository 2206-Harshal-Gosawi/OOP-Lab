package Game;

public class Stadium {
	Court court;
	Audience audience;
	Match matches[];
	String address;
	
	public Stadium(Court court, Audience audience, Match matches[],String address) {
		this.court = court;
		this.audience = audience;
		this.matches = matches;
		this.address = address;
	}

	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	public Audience getAudience() {
		return audience;
	}

	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public Match[] getMatches() {
		return matches;
	}

	public void setMatches(Match match[]) {
		this.matches = match;
	}
	
	
}
