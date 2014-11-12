package array;

public class MaxElemntinanArrayBitonic {

	
	public int findMax(int[] arr)
	{
		int high=arr.length-1;
		int low=0;
		int middle=0;
		while(low<=high)
		{
			middle=(low+high)/2;
			if(low==high)
				return arr[low];
			if(high==low+1 && arr[high]>arr[low])
				return arr[high];
			if(high==low+1 && arr[high]<arr[low])
				return arr[low];
			
			if(arr[middle]>arr[middle+1] && arr[middle]>arr[middle-1])
				return arr[middle];
			else if(arr[middle]>arr[middle+1] && arr[middle]<arr[middle-1])
				 high=middle-1;
			else
				low=middle+1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr={8,10,20,80,100,200,400,500,3,2,1};
           System.out.println(new MaxElemntinanArrayBitonic().findMax(arr));
	}

}
