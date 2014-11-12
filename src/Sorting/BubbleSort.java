package Sorting;

public class BubbleSort {

	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
					{
					int temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
					}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,12,3,5,21,4,6,13};
		bubbleSort(arr);
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
