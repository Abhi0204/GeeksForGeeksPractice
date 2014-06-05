package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumAdjacentSum {

	public static int getMaxSum(String[] array)
	{
		int sumeven=0;
		int sumOdd=0;
		int i=0;
		int j=1;
		
		while(i<array.length)
		{
			sumeven=sumeven+Integer.parseInt(array[i]);
			i=i+2;
		}
		while(j<array.length)
		{
			sumOdd=sumOdd+Integer.parseInt(array[j]);
			j=j+2;
		}
		if(sumOdd>sumeven)
			return sumOdd;
		else
			return
					sumeven;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String[] array=inp.readLine().split(" ");
		
		System.out.println("Maximum Sum is-> "+getMaxSum(array));
		
	}

}
