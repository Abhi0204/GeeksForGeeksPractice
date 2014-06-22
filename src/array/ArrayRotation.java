package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {

	public static void main(String [] args) throws NumberFormatException, IOException
	{

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));

		int[] arr={1,2,3,4,5,6,7};
		int p=0;
		int k=Integer.parseInt(inp.readLine());

		int[] newArray=new int[k];


		for(int j=0;j<k;j++)
		{
			newArray[j]=arr[j];
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i+k>=arr.length)
				break;
			arr[i]=arr[i+k];
		}

		for(int j=arr.length-k;j<arr.length;j++)
		{
			arr[j]=newArray[p];
			p++;
			          
			
		}

		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
	}

}
