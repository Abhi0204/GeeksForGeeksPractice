package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFirstOccurence {

	
	public int findfirstOccurence(String[] arr,int number)
	{	
		int low=0;
		int high=arr.length-1;
		int middle=arr.length/2;
		while(low<=high)
		{
			middle=(low+high)/2;
			if(Integer.parseInt(arr[middle])==number)
				return middle;
			else if(Integer.parseInt(arr[middle])>number)
				high=middle-1;
			else if(Integer.parseInt(arr[middle])<number)
				low=middle+1;
		}
		return 0;
		
	}
	
	public int findfirst(String[] arr,int number)
	{
		int index=findfirstOccurence(arr, number);
		
		for(int i=index;i>=1;i--)
		{
			if(i==1)
			{
				if(Integer.parseInt(arr[i])==Integer.parseInt(arr[i-1]))
					return i-1;
			}
			else if(Integer.parseInt(arr[i])!=Integer.parseInt(arr[i-1]))
			return i;
		}
		return 0;
	}
	
	public int findlast(String[] arr,int number)
	{
		int index=findfirstOccurence(arr, number);
		for(int i=index;i<arr.length-1;i++)
		{
			if(i==arr.length-2)
			{
				if(Integer.parseInt(arr[i])==Integer.parseInt(arr[i+1]))
					return i+1;
			}
			else if(Integer.parseInt(arr[i])!=Integer.parseInt(arr[i+1]))
			return i;
		
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(inp.readLine());
		String[] arr=inp.readLine().split(" ");
		
		FindFirstOccurence first=new FindFirstOccurence();
		System.out.println(first.findfirst(arr, number));
		System.out.println(first.findlast(arr, number));

		
	}

}
