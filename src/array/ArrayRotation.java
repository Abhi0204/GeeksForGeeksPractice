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
		int k=Integer.parseInt(inp.readLine());

		int[] newArray=new int[arr.length];

		int count=0;
		for(int i=k;i<arr.length;i++)
		{
			newArray[count]=arr[i];
			count++;
		}

		for(int j=0;j<k;j++)
		{
			newArray[count]=arr[j];
			count++;
		}

		for(int j=0;j<newArray.length;j++)
		{
			System.out.print(newArray[j]);
		}
	}

}
