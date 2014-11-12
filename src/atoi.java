
public class atoi {

	/**
	 * @param args
	 */
	
	public static int returnNumber(String str)
	{
		
		int number=0;
		int fact=1;
		for(int i=str.length()-1;i>=0;i--)
		{
		  
			int num=str.charAt(i)-'0';
			if(num<10)
			{
			num=num*fact;
			number=number+num;
	        fact=fact*10;
			}
		}
		
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 String str="123456789Abhinav";
	 System.out.println(returnNumber(str));
	}

}
