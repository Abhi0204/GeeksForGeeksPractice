
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
	
	 
public class sort {
	
	    public static void main(String args[]){
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("java", 20);
	        map.put("C++", 45);
	        map.put("Java2Novice", 2);
	        map.put("Unix", 67);
	        map.put("MAC", 26);
	        map.put("Why this kolavari", 93);
	        
	        Set<Entry<String, Integer>> mySet=map.entrySet();
	        List<Entry<String, Integer>> myList=new ArrayList<Map.Entry<String,Integer>>(mySet);
	        
	        Collections.sort(myList, new Comparator<Entry<String, Integer>>()
	        		{

						@Override
						public int compare(Entry<String, Integer> o1,
								Entry<String, Integer> o2) {
							// TODO Auto-generated method stub
							return o1.getValue().compareTo(o2.getValue());
						}
			});
	        
	        for(String i:map.keySet())
	        	System.out.println(i+"=="+map.get(i));
	    }

}
