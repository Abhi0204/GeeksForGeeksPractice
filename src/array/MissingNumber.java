package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int n=Integer.parseInt(inp.readLine());
		String[] array=inp.readLine().split(" ");
		int sum=0;
		/*for(String str:array)
		{
			sum=sum+Integer.parseInt(str);
		}
		
		int totalSum=(n*(n+1))/2;
		*/
		
		 int i;
		    int x1 = Integer.parseInt(array[0]); /* For xor of all the elemets in arary */
		    int x2 = 1; /* For xor of all the elemets from 1 to n+1 */
		     
		    for (i =0; i< array.length; i++)
		        x1 = x1^Integer.parseInt(array[i]);
		           
		    System.out.println(x1);
		    for ( i =1; i <= n; i++)
		        x2 = x2^i;        
		
		    
		    System.out.println(Integer.toBinaryString(x1));
		    System.out.println(Integer.toBinaryString(x2));

		System.out.println("The missing no is "+(x1^x2));
	}

}
