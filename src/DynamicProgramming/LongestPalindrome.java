package DynamicProgramming;

public class LongestPalindrome {
		 
	    public static int longestPalindromeString(String str) {
	        
	    	int max=0;
	    	for(int i=0;i<str.length();i++)
	    	{
	    		int index=findPalindrome(str, i, i);
	    		if(index>max)
	    			max=index;
	    		
	    		index=findPalindrome(str, i, i+1);
	    		if(index>max)
	    			max=index;
	    	}
	    	
	    	return max;
	    }
	 
	        public static int findPalindrome(String str,int i,int j)
	        {
	        	while(i>=0&&j<str.length()&& str.charAt(i)==str.charAt(j))
	        	{
	        		i--;
	        		j++;
	        	}
	        	return j-i-1;
	        }
	        
	        
	 public static String Lp(String str)
	 {
		 String stri;
		 String maxString="";
		 for(int i=0;i<str.length();i++)
		 {
			stri=findPalind(i, i, str);
			if(maxString.length()<stri.length())
				maxString=stri;
			stri=findPalind(i,i+1, str);
			
			if(maxString.length()<stri.length())
				maxString=stri;
		 }
		 
		 return maxString;
	 }
	 
	 public static String findPalind(int first,int last,String str)
	 {
		 while(first>=0&&last<str.length()&& str.charAt(first)==str.charAt(last))
		 {
			 last++;
		     first--;
		 }
		 return str.substring(first+1,last);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str="ABHINITIN";
		System.out.println(LongestPalindrome.longestPalindromeString(str));	
		
		System.out.println(Lp(str));
		}

}
