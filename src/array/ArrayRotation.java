package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {

	
	public  static int[] rotateArray(int[] arr,int k)
	{
		int[] temp=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=arr[i];
			
		}
		
		int j=0;
		int n=k;
		System.out.println(n);
		while(n<arr.length)
		{
		arr[j]=arr[n];
		j++;
		n++;
		}
		int p=0;
		for(int i=j;i<arr.length;i++)
		{
			arr[i]=temp[p];
			p++;
		}
		
		return arr;
	}
	public static void main(String [] args) throws NumberFormatException, IOException
	{

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));

		int[] arr={1,2,3,4,5,6,7};
		
         int[] arr1=rotateArray(arr,2);
		
		for(int j=0;j<arr1.length;j++)
		{
			System.out.print(arr1[j]);
		}
	}

}
