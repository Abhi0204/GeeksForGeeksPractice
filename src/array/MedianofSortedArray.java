package array;

import java.util.Arrays;

public class MedianofSortedArray {

	public int findmedianOfTwoSortedArray(int[] arr1,int[] arr2)
	{

		while(true)
		{
			int middle1=arr1.length/2;
			
			int middle2=arr2.length/2;
			
			if(arr1.length==2 && arr2.length==2)
			{
				return ((Math.max(arr1[0], arr2[0])+Math.min(arr1[1],arr2[1]))/2);
			}
			if(arr1[middle1]==arr2[middle2])
				return middle1;
			
			else if(arr1[middle1]>arr2[middle2])
			{
				arr1=Arrays.copyOfRange(arr1,0,middle1+1);
				arr2=Arrays.copyOfRange(arr2,middle2,arr2.length);
			}
			else if(arr1[middle1]<arr2[middle2])
			{
				arr1=Arrays.copyOfRange(arr1,middle1,arr1.length);
				arr2=Arrays.copyOfRange(arr2,0,middle2+1);
			}
		}
	}
	

	//complexity of Log(n)
	//Divide and conquer
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1={1,2,7,8,11,13};
		int[] ar2={3,4,5,6,12,14};

		MedianofSortedArray median=new MedianofSortedArray();
		System.out.println(median.findmedianOfTwoSortedArray(ar1, ar2));
	}
}
