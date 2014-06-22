package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSumSubarray {

	int maxno=0;
	int sum=0;
	int max;

	public int getSumMax(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int no=Integer.parseInt(arr[i]);
            
			sum=sum+no;
			if(sum<0)
				sum=0;
			
			else if(sum>=maxno)
				maxno=sum;
		
			
			
		}

		return maxno;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		String input = inp.readLine();

		String[] arr = input.split(" ");

		System.out.println(new LargestSumSubarray().getSumMax(arr));

	}

}
