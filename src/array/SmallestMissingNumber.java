package array;

public class SmallestMissingNumber {

	
	public int findSmallestElementMissing(int[] arr)
	{
		int low=0;
		int high=arr.length-1;
		int middle=0;
		
		if(arr[0]!=0)
			return 0;
		while(low<=high)
		{
			middle=(low+high)/2;

			if(arr[middle]!=middle)
				return middle;
			
			if(arr[middle]>middle)
			high=middle-1;
			else
				low=middle+1;
			
			
		}
		return -1;
	}
	
	public int findSmallestElement(int[] arr,int m)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i)
				return i;
		}
		return m-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0,1,2,3};
		SmallestMissingNumber small=new SmallestMissingNumber();
		System.out.println(small.findSmallestElementMissing(arr));
		System.out.println(small.findSmallestElement(arr,5));

	}

}
