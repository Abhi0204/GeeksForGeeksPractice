package Sorting;

public class SelectionSort 
{
	public static int[] SelctionSort(int[] arr)
	{
	int index=0;
		for(int i=0;i<arr.length;i++)
		{
			index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[index]>arr[j])
				{
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,8,0,9,6,13};		
		int[] arr2=SelctionSort(arr);
		for(int i:arr2)
			System.out.print(i+" ");
	}
}
