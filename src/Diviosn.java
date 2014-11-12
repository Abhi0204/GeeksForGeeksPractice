
public class Diviosn {

	/**
	 * @param args
	 */
	
	public static void division(int number,int divide)
	{
		int count=0;
		
		while(number>=divide)
		{
			number=number-divide;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Diviosn div=new Diviosn();
division(10, 5);
		
		
		
	}

}
