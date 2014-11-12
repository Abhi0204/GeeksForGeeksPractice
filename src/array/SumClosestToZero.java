package array;

import java.util.Arrays;

public class SumClosestToZero {

	public void findMinimumSum(int[] arr)
	{
		Arrays.sort(arr);
		
		int i=0;
		int j=arr.length-1;
		int min=Integer.MAX_VALUE;
		while(i<j)
		{
			int temp=arr[i]+arr[j];
			if(min>Math.abs(temp))
				min=Math.abs(temp);
			if(temp>0)
				j--;
			else
				i++;
		}
		
		System.out.println(min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {1, 60, -10, 70, -80, 85};
		  SumClosestToZero sum=new SumClosestToZero();
		sum.findMinimumSum(arr);
	}

}
