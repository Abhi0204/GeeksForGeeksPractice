import java.util.HashMap;
import java.util.Hashtable;


public class SieveofErasothenes {

	/**
	 * @param args
	 */
	

	public boolean[] generateallPrimeNumbers(int number)
	{
		if(number<2)
			return null;
		
		boolean [] arr=new boolean[number+1];
		for(int i=2;i<=number;i++)
		{
			arr[i]=true;
		}
		
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			int j=(int) Math.pow(i, 2);
			while(j<=number)
			{
				arr[j]=false;
				j=j+i;
			}
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SieveofErasothenes check=new SieveofErasothenes();
		boolean [] arr=check.generateallPrimeNumbers(25);
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]==true)
			System.out.print(i+" ");	
		}
	}

}
