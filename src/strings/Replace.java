package strings;

import java.util.HashMap;
import java.util.HashSet;

public class Replace {

	/**
	 * @param args
	 */
	HashMap<String,Character> myMap=new HashMap<String ,Character>();
	public Replace()
	{
		myMap.put("AB",'E');
		myMap.put("BC",'F');
		myMap.put("AC",'G');
	}
	
	public  void replaceString(String str)
	{
		
		char[] arr=str.toCharArray();
		for(int i=1;i<str.length()-1;i++)
		{
			String str1=String.valueOf(str.charAt(i-1));
			String str2=String.valueOf(str.charAt(i));
		   if(myMap.containsKey(str1+str2))
		   {
			   arr[i]=myMap.get(str1+str2);
			   
			   for(int j=i-1;j<str.length()-1;j++)
			   {
				   arr[j]=arr[j+1];
			   }
			   i++;
		   }
		}
		
		for(char i:arr)
			System.out.print(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCD";
		Replace re=new Replace();
		re.replaceString(str);
	}

}
