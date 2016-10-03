package eurohelper.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import eurohelper.model.Match;

public class GroupMatchesData {
	
public static final ArrayList<Match> groupMatchList = new ArrayList<Match>();
private static final SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
	
	private GroupMatchesData() {
    }

    static {   	
    	
    	
    	try {
			groupMatchList.add(new Match(sdf.parse("Jun 10, 2016"),"France","Romania","A"));
			
			groupMatchList.add(new Match(sdf.parse("Jun 11, 2016"),"Albania","Switzerland","A"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 11, 2016"),"Wales","Slovakia","B"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 11, 2016"),"England","Russia","B"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 12, 2016"),"Turkey","Croatia","D"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 12, 2016"),"Poland","Northern Ireland","C"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 12, 2016"),"Germany","Ukraine","C"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 13, 2016"),"Spain","Czech Republic","D"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 13, 2016"),"Republic of Ireland","Sweden","E"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 13, 2016"),"Belgium","Italy","E"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 14, 2016"),"Austria","Hungary","F"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 14, 2016"),"Portugal","Iceland","F"));
	    	
	    	
	    	//-------------------------------------------------------------------------------
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 15, 2016"),"Russia","Slovakia","B"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 15, 2016"),"Romania","Switzerland","A"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 15, 2016"),"France","Albania","A"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 16, 2016"),"England","Wales","B"));    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 16, 2016"),"Ukraine","Northern Ireland","C"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 16, 2016"),"Germany","Poland","C"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 17, 2016"),"Italy","Sweden","E"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 17, 2016"),"Czech Republic","Croatia","D"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 17, 2016"),"Spain","Turkey	","D"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 18, 2016"),"Belgium","Republic of Ireland","E"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 18, 2016"),"Iceland","Hungary","F"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 18, 2016"),"Portugal","Austria","F"));
	    	
	    	//-------------------------------------------------------------------------------
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 19, 2016"),"Romania","Albania","A"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 19, 2016"),"Switzerland","France","A"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 20, 2016"),"Russia","Wales","B"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 20, 2016"),"Slovakia","England","B"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 21, 2016"),"Ukraine","Poland","C"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 21, 2016"),"Northern Ireland","Germany","C"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 21, 2016"),"Czech Republic","Turkey","D"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 21, 2016"),"Croatia","Spain","D"));
	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 22, 2016"),"Iceland","Austria","F"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 22, 2016"),"Hungary","Portugal","F"));	    	
	    	groupMatchList.add(new Match(sdf.parse("Jun 22, 2016"),"Italy","Republic of Ireland","E"));
	    	groupMatchList.add(new Match(sdf.parse("Jun 22, 2016"),"Sweden","Belgium","E"));
	    	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

    
}
