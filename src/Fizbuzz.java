
public class Fizbuzz {
	public static void print(int number)
	{
		if(number<0)
			return;
		
		for(int i=3;i<number;i++)
		{
			if(i%15==0)
		    	System.out.println(i+"FizzBuzz");
			
			else if(i%3==0)
		    	System.out.println(i+"fizz");
		    else if (i%5==0)
		    	System.out.println(i+"buzz");
		   
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(100);
	}

}
