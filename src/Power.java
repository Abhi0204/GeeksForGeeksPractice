
public class Power {

	/**
	 * @param args
	 */
	
	public static int calculatePower(int a,int x)
	{
		if(x<1)
			return 1;				
		int temp=calculatePower(a, x/2);
		if(x%2==0)
			return temp*temp;
		else 
			return a*temp*temp;
		
	}
		
	static void powFast(int b, int e) {
	int number=1;
		while(e>1)
	 {
		 number=number*b;
		 e--;
	 }
		System.out.println(number);
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calculatePower(3, 4));
	}

}
