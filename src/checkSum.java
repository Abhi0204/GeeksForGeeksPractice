import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class checkSum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public char getFirstCharacter(InputStreamReader str) throws IOException
	{
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		char ch=(char) str.read();
		
		while(ch!=0)
		{
		map.put(ch,1);
		}
		
		Iterator iterator=map.keySet().iterator();
		
		while(iterator.hasNext())
		{
			Character sr=(Character) iterator.next();
			int val=map.get(sr);
			if(val==1)
				return sr;
		}
		
		return '0';
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
