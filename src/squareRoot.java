import java.util.Scanner;


public class squareRoot {

	public static void findsqaureroot(int number)
	{
		float low=0;
		float middle=0;
		float high=number;
		
		while(Math.abs(middle*middle-number)>.0001)
		{
			middle=(low+high)/2;
			if(middle*middle>number)
				high=middle;
			else
				low=middle;
		}
		
		System.out.println(middle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnn=new Scanner(System.in);
		int number=scnn.nextInt();
		findsqaureroot(number);
	}

}
