import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Schedule {
    public static List<Show> findOptimalSchedule(Collection<Show> shows)
    {
        if(shows.isEmpty()==true)
    		return null;
        if(shows.size()==1)
        	return (List<Show>) shows;
         	
          ArrayList<Show> showList = new ArrayList<Show>();
        for(Show s : shows){
        showList.add(s);
        }
        
        
        Collections.sort(showList, new Show());
        
    	
      Date endTime = null;
      boolean flag=false;
      List<Show> newShows=new ArrayList<Show>();
    	for(Show str: showList)
    	{
    		if(flag==false)
    		{
    			endTime=str.getEndTime();
    			newShows.add(str);
    			flag=true;
    		}
    		else
    		{
    		  Date starTime=str.getStartTime();
    		  if((endTime.compareTo(starTime))<0)
    		  {
    			  newShows.add(str);
    			  endTime=str.getEndTime();
    		  }
    		}
    	   
    	}
    	
    		
    	return newShows;
    }

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

		ArrayList<Show> shows = new ArrayList<Show>();
		shows.add(new Show("Show1", sdf.parse("2013-08-06 18:00"), sdf.parse("2013-08-06 20:00")));
		shows.add(new Show("Show2", sdf.parse("2013-08-06 19:00"), sdf.parse("2013-08-06 22:00")));
		shows.add(new Show("Show3", sdf.parse("2013-08-06 21:00"), sdf.parse("2013-08-06 23:00")));

		List<Show> list = Schedule.findOptimalSchedule(shows);
		for (Show show : list) {
			System.out.println(show.getName());
		}
	}
}

class Show implements Comparator<Show>{
    private String name;
    private Date startTime;
    private Date endTime;
    
    public Show(){
   
    }
    
    public Show(String name, Date startTime, Date endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

@Override
public int compare(Show o1, Show o2) {
return o1.getEndTime().compareTo(o2.getEndTime());
}
}