package eurohelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import eurohelper.data.GroupMatchesData;
import eurohelper.model.Match;

public class GroupMatchesService {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
	
	public static List<Match> getMatchesByCountry(String countryName){
		
		List<Match> matchesByCountry = GroupMatchesData.groupMatchList.stream().filter(p -> p.getCountry1().equalsIgnoreCase(countryName) ||  p.getCountry2().equalsIgnoreCase(countryName)).collect(Collectors.toList());
				
		return matchesByCountry;
		
	}
	
	public static List<Match> getMatchesByGroup(String groupName){
		
		List<Match> matchesByGroup = GroupMatchesData.groupMatchList.stream().filter(p -> p.getGroup().equalsIgnoreCase(groupName)).collect(Collectors.toList());
				
		return matchesByGroup;
		
	}
	
	public static List<Match> getMatchesByDate(Date date){
		
		System.out.println("getMatchesByDate start" + date.toString());
		
		List<Match> matchesByGroup = GroupMatchesData.groupMatchList.stream().filter(p -> sdf.format(p.getMatchDate()).equals(sdf.format(date))).collect(Collectors.toList());
				
		return matchesByGroup;
		
	}
	
}
