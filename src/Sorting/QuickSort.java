package Sorting;

public class QuickSort {

	/**
	 * @param args
	 */
	int[] arr;
	public QuickSort(int[] arr)
	{
		this.arr=arr;
	}
	public void quickSort(int low,int high,int[] arr)
	{
		int q=0;
		if(low<high)
			q=partition(arr, low, high);
		quickSort(low,q-1,arr);
		quickSort(q+1, high, arr);
	}
	
	public int partition(int[] arr,int low,int high)
	{
		int middle=(low+high)/2;
		int temp=arr[low];
		arr[low]=arr[middle];
		arr[middle]=arr[low];
		
		int pivot=arr[low];
		int left=low+1;
		while(low<=high)
		{
			while(arr[high]>pivot)
				high--;
			while(arr[low]<pivot)
				low++;
			
			if(low<=high)
			{
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		temp=arr[left];
		arr[left]=arr[high];
		arr[high]=temp;
		
		
		return high;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {8,13,2,4,9};
        QuickSort quick=new QuickSort(arr);
       quick.quickSort(0,arr.length-1, arr);
       
        for(int i=0;i<quick.arr.length;i++)
        	System.out.print(quick.arr[i]+" ");
        
	}

}
