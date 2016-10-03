package eurohelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import eurohelper.model.Match;

public class MatchesToSpeechHelper {
	
	
	public static String getCountryResponseSpeech(List<Match> matches, String country){
		
		if(matches==null || matches.size()<1)
			return null;
		
		String response = "The matches for " + country + " are :";
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd");
		
		for (Match match : matches) {
			
			String opponentCountry = "";
			
			if(country.equalsIgnoreCase(match.getCountry1()))
			{
				opponentCountry = match.getCountry2();
			}
			else
			{
				opponentCountry = match.getCountry1();
			}
			
			response+= " vs " + opponentCountry + " on " + sdf.format(match.getMatchDate()) + ";";
		}
		
		return response;
	}
	
	public static String getGroupResponseSpeech(List<Match> matches, String group){
		
		if(matches==null || matches.size()<1)
			return null;
		
		String response = "The matches for group " + group + " are :\n";
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd");
		
		for (Match match : matches) {
						
			response+= " " + match.getCountry1() + " vs " + match.getCountry2() + " on " + sdf.format(match.getMatchDate()) + ";\n";
		}
		
		return response;
	}
	
	public static String getDateResponseSpeech(List<Match> matches, Date date){
	
	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd");
	
		if(matches==null || matches.size()<1)
			return null;
		
		String response = "The matches for " + sdf.format(date) + " are :\n";
				
		for (Match match : matches) {
						
			response+= " " + match.getCountry1() + " vs " + match.getCountry2() + ";\n";
		}
		
		return response;
	}
}
