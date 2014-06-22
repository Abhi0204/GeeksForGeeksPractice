package array;

import java.util.Arrays;

public class Buildings {

	public int getNoOfBuildings(int[] arr,int M)
	{
		
		Arrays.sort(arr);
		int sum=0;
		int minimum=Integer.MAX_VALUE;
		int index=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			
			flag=false;
			for(int j=i;j<i+M-1;j++)
			{
				if(i+M-1>arr.length-1)
					break;
				sum=sum+(arr[i+M-1]-arr[j]);
				flag=true;
				
			}
			if(flag==true)
			{
	    	minimum=Math.min(minimum, sum);
			}
		sum=0;	
		}
	
		return minimum;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buildings build=new Buildings();
		int[] arr={12,9,19,13,23,11,17};
		System.out.println(build.getNoOfBuildings(arr, 3));
	}

}
