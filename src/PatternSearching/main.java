package PatternSearching;

import java.util.HashSet;

public class main {

	/**
	 * @param args
	 */
	
    static HashSet<String> myset=new HashSet<String>();

    public static void putSuffix(String beginningString,String endingString)
    {
    	if(endingString.length()==1)
    		myset.add(beginningString+endingString);
    	for(int i=0;i<endingString.length();i++)
    	{
    		String str=endingString.substring(0,i)+endingString.substring(i+1);
    		putSuffix(beginningString+endingString.charAt(i), str);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BuildTrieSuffix check=new BuildTrieSuffix();
      
      putSuffix("","geek");
      System.out.println(myset);
      
     check.CreateSuffix("geeksforgeeks","geek");
	}

}
