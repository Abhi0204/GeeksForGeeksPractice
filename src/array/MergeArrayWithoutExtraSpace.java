package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeArrayWithoutExtraSpace {


	public static int[] MergeTwoArrays(int[] arr,int[] arr2,int m,int n)
	{
		int x=m+n+1;

		while(m>=0 && n>=0)
		{
			if(arr[m]>=arr2[n])
			{
			   arr[x]=arr[m];
			   x--;
			   m--;
			}
			else
				{
				arr[x]=arr2[n];
				x--;
				n--;
				}
			
		}

		while(m>=0)
			arr[x--]=arr[m--];
		while(n>=0)
			arr[x--]=arr2[n--];
		
		
		return arr;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] arr=new int[9];
		int[] arr1=new int[4];

		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		String[] Strarr=buff.readLine().split(" ");
		String[] strarr2=buff.readLine().split(" ");

		int i=0;
		for(String str:Strarr)
		{
			arr[i]=Integer.parseInt(str);
			i++;
		}

		int j=0;
		for(String str:strarr2)
		{
			arr1[j]=Integer.parseInt(str);
			j++;
		}
		
		
		MergeTwoArrays(arr, arr1,Strarr.length-1, strarr2.length-1);
		
		for(int itr:arr)
			System.out.print(itr);
	}

}
