package array;

public class BinarySearchSort {

	/**
	 * @param args
	 */

	//Find the first and lastOccurencr of a number
	public static void findFistOccurence(int[] arr,int a)
	{
		int low=0;
		int high=arr.length-1;
		int middle;

		while(low<=high)
		{
			middle=(low+high)/2;
			if(arr[middle]== a )
			{
				if(middle!=0 && (arr[middle]!=arr[middle-1]))
				{
					System.out.println("No "+ a +" is found at location "+middle);
					return;
				}
				else if(middle==0){
					System.out.println("No "+ a +" is found at location "+middle);	
					return;
				}
			}
			if(arr[middle]== a&&(arr[middle]==arr[middle-1]))
				high=middle-1;
			else if(arr[middle]>a)
				high=middle-1;
			else 
				low=middle+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,3,3,4,4,4,4,5,5,5,5,5,7,7,7,7};
		findFistOccurence(arr,1);
	}

}
