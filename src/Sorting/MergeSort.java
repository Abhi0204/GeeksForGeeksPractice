package Sorting;

public class MergeSort
{
	public int[] array;
	public int[] tempMergArr;
	
	public void sort(int[] arr)
	{
		array=arr;
		tempMergArr =new int[array.length];
		
		mergeSort(0, array.length-1);
		for(int i:array)
			System.out.print(i+" ");
	}
	
	public void mergeSort(int low,int high)
	{
		if(low<high)
		{
			int middle=(low+high)/2;
			mergeSort(low, middle);
			mergeSort(middle+1,high);
			merge(low, middle, high);
		}
	}
	
	public void merge(int low,int middle,int high)
	{
		for(int i=low;i<=high;i++)
		{
			tempMergArr[i]=array[i];
		}
		
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<=middle && j<=high)
		{
			if(tempMergArr[i]<tempMergArr[j])
			array[k++]=tempMergArr[i++];
			
			else
				array[k++]=tempMergArr[j++];
		}
		
		while(i<=middle)
		array[k++]=tempMergArr[i++];
		while(j<=high)
			array[k++]=tempMergArr[j++];
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,-44,-11,12,4,77,8};
		MergeSort mergeSort=new MergeSort();
		mergeSort.sort(arr);
	}
		
}