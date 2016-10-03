import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import eurohelper.GroupMatchesService;
import eurohelper.MatchesToSpeechHelper;
import eurohelper.model.Match;

public class MatchesTester {

	@Test
	public void testByCountry() {
		List<Match> matches = GroupMatchesService.getMatchesByCountry("Germany");
		assertTrue(matches.size() == 3);
		
		matches = GroupMatchesService.getMatchesByCountry("italy");
		assertTrue(matches.size() == 3);
		
		matches = GroupMatchesService.getMatchesByCountry("Colombia");
		assertTrue(matches.size() == 0);
	}

	@Test
	public void testByGroup() {
		List<Match> matches = GroupMatchesService.getMatchesByGroup("z");
		assertTrue(matches.size() == 0);
		
		matches = GroupMatchesService.getMatchesByGroup("A");
		assertTrue(matches.size() == 6);
		
		matches = GroupMatchesService.getMatchesByGroup("D");
		assertTrue(matches.size() == 6);
	}
	
	@Test
	public void testByDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date testDate;
		
		try {
			testDate = sdf.parse("2016-06-10");
			System.out.println(testDate.toString());
			List<Match> matches = GroupMatchesService.getMatchesByDate(testDate);
			assertTrue(matches.size() > 0);
			
			System.out.println(MatchesToSpeechHelper.getDateResponseSpeech(matches, testDate));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assert(false);
		}
		
		
	}
	
	@Test
	public void matchesSpeechResponse() {
		List<Match> countrymatches = GroupMatchesService.getMatchesByCountry("Germany");
		assertTrue(countrymatches.size() == 3);
		
		System.out.println(MatchesToSpeechHelper.getCountryResponseSpeech(countrymatches, "germany"));
		
		List<Match> groupmatches = GroupMatchesService.getMatchesByGroup("D");
		assertTrue(groupmatches.size() == 6);
		
		System.out.println(MatchesToSpeechHelper.getGroupResponseSpeech(groupmatches, "D"));
	}
	
}
