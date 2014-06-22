package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumDifference {

	public int getMaxDifference(String[] arr)
	{
		int max=Integer.parseInt(arr[arr.length-1]);
		int maxDiff=0;
		int diff=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			diff=max-Integer.parseInt(arr[i]);
			if(diff>maxDiff)
			maxDiff=diff;
			
			if(Integer.parseInt(arr[i])>max)
				max=Integer.parseInt(arr[i]);
		}
		
		return maxDiff;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String[] array=inp.readLine().split(" ");
		
		MaximumDifference mac=new MaximumDifference();
		System.out.println(mac.getMaxDifference(array));
	}

}
