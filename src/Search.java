
public class Search {

	/**
	 * @param args
	 */
	
	public static void SearchBS(int [] arr,int n)
	{
		int low=0;
		int high=arr.length-1;
		int  middle;
		while(low<=high)
		{
			middle=(low+high)/2;
			System.out.println(middle);
			if(arr[middle]==n)
			{
				System.out.println(middle);
			break;
		}
			
			else if(arr[middle]>n)
				high=middle-1;
			else
				low=middle+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0,1,2,3,4};
		SearchBS(arr, 1);
	}

}
