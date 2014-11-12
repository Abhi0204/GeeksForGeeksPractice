package array;

public class FindTheOccurenceinSortedArray {

	/**
	 * @param args
	 */
	
	public static int findfirstOccurence(int []arr,int key)
	{
		int low=0;
		int high=arr.length-1;
		int middle;
		
		
		while(low<=high)
		{
			middle=(low+high)/2;
			if(arr[middle]==key && middle!=0)
				{
				if(arr[middle]!=arr[middle-1])
				return middle;
					high=middle-1;
				}
			else if(arr[middle]==key && middle==0)
				return middle;
			
			else if(arr[middle]>key)
				high=middle-1;
			else
				low=middle+1;
			
		}
		
		return -1;
	}
	
	public static int findLastOccurence(int []arr,int key)
	{
		int low=0;
		int high=arr.length-1;
		int middle;
		
		
		while(low<=high)
		{
			middle=(low+high)/2;
			if(arr[middle]==key && middle!=arr.length-1)
				{
				if(arr[middle]!=arr[middle+1])
				return middle;
				else
					low=middle+1;
				}
			else if(arr[middle]==key && middle==arr.length-1)
				return middle;
			
			else if(arr[middle]>key)
				high=middle-1;
			else
				low=middle+1;
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,1,1,1,1,2,2,2,2,3,3,3,3,7,8,8,8,8};
		
		int first=findfirstOccurence(arr, 8);
		int last=findLastOccurence(arr, 8);
		System.out.println("Total Occurence of a number  is "+(last-first+1));
	}

}
