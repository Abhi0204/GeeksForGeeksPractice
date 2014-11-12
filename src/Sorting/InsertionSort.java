package Sorting;

import java.util.LinkedList;

public class InsertionSort {

	public static int[] InsertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		LinkedList<String>[] array=new LinkedList[10];
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,12,3,5,21,4,6,13};
    
		InsertionSort(arr);
		
		for(int i:arr)
			System.out.print(i+" ");
	}

}
