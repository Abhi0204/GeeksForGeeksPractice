
public class PrimeNumberFactors {
	
	public static void printPrimeFactors(int number)
	{
		if(number<0)
			System.out.println("No Prime Factors");

		while(number>1)
		{
			if(number%2==0){
				System.out.println(2);
				number=number/2;
			}
			else
				break;
			
		}
		int i=3;	
		while(i<Math.sqrt(number))
		{
			if(number%i==0)
			{
				System.out.println(i);
				number=number/i;
			}
			else
				i=i+2;
		}
		
		if(number>1)
			System.out.println(number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number=1001;
		printPrimeFactors(number);
	}

} 
