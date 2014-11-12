package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSumSubarray {

	int maxno=0;
	int sum=0;
	int min=Integer.MIN_VALUE;
	int count=0;
	public int getSumMax(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(Integer.parseInt(arr[i])<0)
			{
				if(min<Integer.parseInt(arr[i]))
					min=Integer.parseInt(arr[i]);
				count++;
				
			}
				
			int no=Integer.parseInt(arr[i]);
            
			sum=sum+no;
			if(sum<0)
				sum=0;
			
			if(sum>=maxno)
				maxno=sum;
		
			
			
		}

		if(count==arr.length)
			return  min;
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
