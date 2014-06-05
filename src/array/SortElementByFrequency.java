package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortElementByFrequency {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] arr=inp.readLine().split(" ");
	    Map<String,Integer> map = new HashMap<String,Integer>();
	   for(String str: arr)
	   {
		   if(map.containsKey(str))
		   map.put(str,map.get(str)+1);
		   else
			   map.put(str,1);
 
	   }
	   Set<Map.Entry<String,Integer>> entry = map.entrySet();
	   
	   Comparator<Map.Entry<String,Integer>> comparator = new Comparator<Map.Entry<String,Integer>>() {
	        @Override
	        public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
	            Integer value1 = o1.getValue();
	            Integer value2 = o2.getValue();
	            return value2.compareTo(value1);
	        }
	    };
	    
	     Set<Map.Entry<String,Integer>> sortedSet = new TreeSet(comparator);
	     
	    sortedSet.addAll(entry);
	    
	     Map<String,Integer> sortedMap =  new LinkedHashMap<String,Integer>();
	    for(Map.Entry<String,Integer> entry1 : sortedSet ){
	        sortedMap.put(entry1.getKey(),entry1.getValue());
	    }
	    
	    String result="";
	    for(String key:sortedMap.keySet())
	    {
	    	
	    	int count=sortedMap.get(key);
	    	for(int i=0;i<count;i++)
	    	{
	    		result=result+key+" ";
	    	}
	    }
	    System.out.println(result);
	}
}