package DynamicProgramming;

public class ConvertingaStringToPlaindrome {

	/**
	 * @param args
	 */
	
	
	public void convertPalindrome(String str)
	{
		int index=0;
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			j=str.length()-1;
			index=i;
			boolean flag=false;
			
			while(index<=j)
			{
			   if(str.charAt(index)!=str.charAt(j))
			   {flag=false;
				   break;
			   }
			   else{
				   index++;
				   j--;
				   flag=true;
			   }
			}
			
			if(flag==true)
			{
				index=i;
				break;
			}
		}
		
		for(int i=index-1;i>=0;i--)
		{
			str=str+str.charAt(i);
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="HEELE";
		ConvertingaStringToPlaindrome sonvert=new ConvertingaStringToPlaindrome();
		sonvert.convertPalindrome(str);
	}

}
