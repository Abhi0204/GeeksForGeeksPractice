
public class ReverseAnumber {

	/**
	 * @param args
	 */
	public static void reverse(int number)
	{
		int num=0;
		while(number>0)
		{
			
			int quo=number/10;
			int rem=number%10;
			num=num+rem;
			if(quo!=0)
			num=num*10;
			number=quo;
		}
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=123;
		reverse(n);
	}

}
