package eurohelper.model;

import java.util.Date;

public class Match {
	private Date matchDate;
	private String country1;
	private String country2;
	private String group;
	
	public Match(Date matchDate, String country1, String country2, String group) {
		super();
		this.matchDate = matchDate;
		this.country1 = country1;
		this.country2 = country2;
		this.group = group;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public String getCountry1() {
		return country1;
	}

	public String getCountry2() {
		return country2;
	}
	
	public String getGroup(){
		return group;
	}
	
}
